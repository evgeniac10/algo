package dataStruc;
import java.util.*;

public class num2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> que = new LinkedList<>();
        for(int i=1; i<=N; i++){
            que.add(i);
        }
        while(que.size() != 1){
            int outNum = que.poll();

            int inNum = que.poll();

            que.add(inNum);
        }
        System.out.println(que.peek());
    }
}
