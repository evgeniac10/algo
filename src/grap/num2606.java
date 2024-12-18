package grap;

import java.util.*;
/**
 * DFS를 통해서 1번 컴퓨터와 연결된 컴퓨터 수를 count해준다.
 * 전에 검사했는지 알기 위해서 visit이라는 boolean형을 통해서 확인한다.
 * map이라는 이차원배열을 이용하여 각 컴퓨터끼리 연결상태를 나타내준다.
 */
public class num2606 {
    static int[][] map;
    static boolean[] visit;
    static int infectedComputer;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        //컴퓨터 번호는 1부터 , 인덱스는 0번부터이니 한개를 더 추가하여 번호를 맞춰준다.
        map = new int[N+1][N+1];
        visit = new boolean[N+1];
        infectedComputer = 0;
        for(int i=0; i<M; i++){
            int computerOne = sc.nextInt();
            int computerTwo = sc.nextInt();
            map[computerOne][computerTwo] = 1;
            map[computerTwo][computerOne] = 1;
        }
        visit[1] = true;
        dfs(1);
        System.out.println(infectedComputer);
    }
    static void dfs(int startComputer){
            for(int col=0; col< map.length; col++){
                //컴퓨터가 연결되어 있고 검사한적이없다면
                if(map[startComputer][col] == 1 && !visit[col]){
                    visit[col] = true;
                    infectedComputer+=1;
                    dfs(col);
                }
            }
    };
}
