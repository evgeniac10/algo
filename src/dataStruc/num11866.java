package dataStruc;

import java.io.*;
import java.util.*;

/**
 * 자료구조 큐에서 선입선출을 이용한다.
 * 큐의 자료가 없을때까지 반복한다.
 * 두 번은 다시 넣고 한 번은 빼서 출력할 StringBuilder에 담는다.
 */
public class num11866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();
        for(int i=1; i<=N;i++){
            que.add(i);
        }
        StringBuilder sb = new StringBuilder();

        sb.append("<");
        //que가 비어있지 않다면 true que가 비어있다면 false
        while(que.size() > 1){
                int inputOne = que.poll();
                que.add(inputOne);
                int inputTwo = que.poll();
                que.add(inputTwo);
                sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll());
        sb.append(">");

        System.out.println(sb);

    }
}
