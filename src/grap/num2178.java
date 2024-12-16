package grap;

import java.util.*;

public class num2178{
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visit;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N+1][M+1];
        visit = new boolean[N+1][M+1];

        for(int row=1; row<=N; row++){
            String str = sc.next();
            for(int col=1; col<=M; col++){
                map[row][col] =str.charAt(col-1) - 48;
            }
        }
        bfs(1,1);
        System.out.println(map[N][M]);
    }

    static void bfs(int x , int y){
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {x,y});
        visit[x][y] = true;
        while(!que.isEmpty()){
            int[] nowXY = que.poll();
            int nowX = nowXY[0];
            int nowY = nowXY[1];
            //동서남북으로 한칸씩 이동하며 이동 가능 경로 탐색
            for(int i=0; i<4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if(nextX < 1 || nextY < 1 || nextX > N || nextY >M){
                    continue;
                }
                if(map[nextX][nextY] == 0 || visit[nextX][nextY]){
                    continue;
                }
                que.add(new int[]{nextX, nextY});
                map[nextX][nextY] = map[nowX][nowY] + 1;
                visit[nextX][nextY] = true;
            }
        }
    }
}