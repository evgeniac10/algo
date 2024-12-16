package grap;

import java.util.*;
/*
시작위치는 (1,1)로 고정되어 있으면 목표지점은 입력받은 (N,M)이다.
2차원배열의 해당 지점으로 이동하여 갈 수 있는 경로를 찾은 뒤 해당 경로로 한칸 이동
다시 반복하여 경로를 찾는다
목표지점에 도착한다면 최소의 이동수를 반환한다.
 */
public class num2178 {
    //static을 통해 dfs함수에 필요한 매개변수를 줄일수 있다.
    static int N;
    static int M;
    static int[][] graph;
    static boolean[][] visited;
    static int[] moveX = {1,-1,0,0};//북 , 남
    static int[] moveY = {0,0,1,-1};//동 , 서

    static void bfs(int row , int col){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {row,col});
        visited[row][col] = true;
            while(!que.isEmpty()){
                int[] nowPoint = que.poll();
                int nowX = nowPoint[0];
                int nowY = nowPoint[1];

                for(int i=0; i<4; i++){
                    int nextX = nowX + moveX[i];
                    int nextY = nowY + moveY[i];

                    if(nextX < 1 || nextY < 1 || nextX > N || nextY > M){
                        continue;
                    }
                    if(graph[nextX][nextY] == 0 || visited[nextX][nextY]){
                        continue;
                    }
                    que.add(new int[]{nextX, nextY});
                    graph[nextX][nextY]= graph[nowX][nowY] + 1;
                    visited[nextX][nextY] = true;
                }
            }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];

        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<M; j++){
                graph[i+1][j+1] = ((int) str.charAt(j)-48);
            }
        }

        bfs(1,1);
        System.out.println(graph[N][M]);

//        System.out.println("--------------------------------------------before----------------------------------------------");
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                System.out.print(graph[i + 1][j + 1]);
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------------------------after----------------------------------------------");
//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                System.out.print(graph[i + 1][j + 1] + " ");
//            }
//            System.out.println();
//        }

    }
}
