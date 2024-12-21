package DP;

import java.util.*;

/**
 * 0과 1이 얼만큼 나오는지 횟수를 출력하라고 했기 때문에 이는 전에 구했던 과정에서 0과1이 나온 횟수를 저장해놓고
 * 다음 숫자 계산에서 저장된 값을 불러오면 함수를 계속 호출하지 않더라도 빠른 연산이 가능하다.
 */
public class num1003 {

    static int[] memo;
    static int cntZero;
    static int cntOne;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        memo = new int[40];
        memo[0] = 0;
        memo[1] = 1;

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            cntZero = 0;
            cntOne = 0;
            fibo(sc.nextInt());
            sb.append(cntZero).append(" ").append(cntOne).append("\n");
        }

        System.out.println(sb);
    }
    public static int fibo(int N){

        if(N==0){
            cntZero++;
            return memo[0];
        }
        if(N==1){
            cntOne++;
            return memo[1];
        }
        if(memo[N] != 0) {
            return memo[N];
        }
        return fibo(N-2)+fibo(N-1);
    }
}
