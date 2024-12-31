package dataStruc;

import java.io.*;
import java.util.*;

public class num1966 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while(T-->0){
            StringTokenizer token = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(token.nextToken());
            int M = Integer.parseInt(token.nextToken());
            token = new StringTokenizer(br.readLine());

            LinkedList<int[]> que = new LinkedList<>();

            for(int i=0; i<N; i++){
                que.add(new int[] {i,Integer.parseInt(token.nextToken())});
            }
            //큐 자료구조에서 출력한 종이를 셀 변수
            int printedPaper = 0;

            while(!que.isEmpty()){
                int[] paper = que.poll();
                boolean isMax = true;

                for(int i=0; i<que.size(); i++){
                    //가장 처음에 있는것을 꺼내서 우선 순위를 비교하는데 우선순위 높은것이 있다면
                    if(paper[1] < que.get(i)[1]){
                        //가장 처음에 뺏던 것을 다시 큐 맨 뒤로 넣어서 가장 우선순위가 높은것 전까지 넣는다.
                        que.add(paper);

                        for(int j=0; j<i; j++){
                            que.add(que.poll());
                        }
                        isMax = false;
                        //break를 해야 우선 순위가 높지 않는 경우에 printedPaper가 1 올라가는것을 막을 수 있음
                        break;
                    }
                }

                if(!isMax){
                    continue;
                }
                printedPaper++;
                //우선 순위가 가장 높았다면 break에 걸리지 않아서 1을 추가해야함
                if(paper[0] == M){
                    sb.append(printedPaper).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
