package grap;

import java.util.*;

/*
정점 노드의 개수만큼 2차원 배열로 만든 뒤
입력받는 정점 연결 관계에 따라서 2차원배열에서 연결되어 있다면 1 안되어있다면 0으로 초기화한다.
정점에 따른 boolean형태의 배열을 만들어 방문하였는지 체크한다.
DFS - 방문한 노드 입장에서  연결되어 있는 노드로 진행 / BFS - 연결되어있는 노드들을 FIFO형식인 큐에 저장하여 탐색해나간다.
 */
public class num1260 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        int startNode = sc.nextInt();
        //노드가 거쳐가는 순서를 저장할 배열 (인덱스는 순서번호 , 인덱스 안의 값은 노드 번호)
        int[] dfsResult = new int [node];
        int[] bfsResult = new int [node];

        //노드끼리 연결관계를 나타내는 그래프 초기값은 0으로 세팅 , 노드번호는 1부터 시작하니 +1을 하여 번호를 맞춰준다.
        int[][] graph = new int[node+1][node+1];

        for(int i=0; i<edge; i++){
            int nodeTo = sc.nextInt();
            int nodeFrom = sc.nextInt();
            graph[nodeTo][nodeFrom] = 1;
            graph[nodeFrom][nodeTo] = 1;
        }

        //방문하였는지 체크 할 수 있는 boolean형 배열 , 방문하였다면 true , 방문하지 않았다면 false
        //번호에 맞게 방문처리 하기 위해서 배열의 크기를 1을 더한다. (인덱스 번호가 곧 노드 번호)
        boolean[] dfsVisited = new boolean[node+1];
        boolean[] bfsVisited = new boolean[node+1];
        //dfs 시작 노드 방문
        int dfsIndex = 0;
        dfs(graph,dfsResult,startNode,dfsVisited,dfsIndex);

        //bfs 시작 노드 방문
        int bfsIndex = 0;
        //우선순위로 작은순서대로 노드가 방문할 수 있도록
        bfs(graph,bfsResult,startNode,bfsVisited,bfsIndex);

        //dfs, bfs 결과 출력하기
        for(int i=0; i<dfsResult.length; i++){
            System.out.print(dfsResult[i] + " ");
        }
        System.out.println();
        for(int i=0; i<bfsResult.length; i++){
            System.out.print(bfsResult[i] + " ");
        }
    }
    /*
    시작하는 노드에서 출발해서 연결되어있는 노드를 찾는데, 연결됨을 알 수 있는 방법은 graph를 통해서 (1이면 연결됨)
    (row)번 노드에 연결되어 있는 노드 번호가 {col1,col2..}있다면 작은 순서대로 방문한다
    방문을 한 노드(col)를 기반으로 다시 (row)번으로 놓고 연결되어있는 노드를 찾고 방문처리한다.
    더이상 방문 할 노드가 없다면 다시 돌아간다.
     */
    static void dfs(int[][] graph, int[] dfsResult, int startNode, boolean[] visited, int index){
        dfsResult[index] = startNode;
        visited[startNode] = true;

        for(int col=0; col<graph.length; col++){
            //시작노드를 행,목표하는 노드를 열로 하여 0과1로 연결되어있는지 확인 && 방문한적 없는 노드라면 방문처리 후 result에 담는다.
            if(graph[startNode][col] == 1 && !visited[col]){
                dfs(graph, dfsResult, col, visited,++index);
            }
        }
        return;
    }
    /*
    시작하는 노드에서 그래프를 이용하여 연결이 되어있는지를 찾는다.
    연결이 되어있다면(1) Result배열에 작은 순서대로 담는다(col).
    방문한 col은 true로 방문 처리를 한 뒤 Result의 다음 인덱스를 startNode로 잡아서 실행한다.
     */
    static void bfs(int[][] graph, int[] bfsResult, int startNode,boolean[] visited, int index){
        visited[startNode]=true;
        bfsResult[index]=startNode;

        ArrayList<Integer> list = new ArrayList<>();
        //작은 번호 순서대로 돌면서 연결되어있는지 그리고 방문한 적이 있는지 체크하기
        for(int col=0; col<graph.length; col++){
            if(!visited[col] && graph[startNode][col] == 1){
                bfsResult[++index] = col;
                visited[col]=true;
                list.add(col);
            }
        }
        //result 배열에서 담긴 startnode에서 다음 인덱스에 담긴 node를 bfs함수의 startNode로 다시 넣는다.
        for(int num=0; num<list.size(); num++){
            bfs(graph, bfsResult, list.get(num), visited, index);
        }
        return;
    }
}
