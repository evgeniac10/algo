package DP;

import java.io.*;

/**
 * 타일링이 이미 계산되어 있다면 메모제이션을 한 memo에서 꺼낸다.
 * 점화식은 N일때 = N-1 일때 횟수와 N-2 일때 횟수를 더한다.
 */
public class num11726 {
    static int[] memo;
    public static int tile(int N){
        //저장된 값이 있다면 저장된 값을 꺼내준다.
        if(memo[N] != 0){
            return memo[N];
        }
        if(N == 1) return memo[1];
        if(N == 2) return memo[2];

        //저장된 값이 없다면 계산한 뒤 저장해준다.
        memo[N] = (tile(N - 1) + tile(N - 2))%10007;

        return memo[N];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        memo = new int[N+2];
        memo[1] = 1;
        memo[2] = 2;
        System.out.println(tile(N));
    }
}
