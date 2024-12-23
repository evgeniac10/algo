package Ztring;

import java.util.*;

/**
 * 입력값이 N은 500,000 M은 500,000이다. 그래서 입력횟수가 250,000,000,000번이다.
 * 컴퓨터가 평균적으로 연산을 1초에 10^8번 실행하는데 현재 프로세스는 평균적으로 초당 10GHz단위로 연산을 처리한다.
 * 10GHz = 10^9Hz이고 컴퓨터가 연산을 처리하는데 2-3클럭을 사용한다라고 한다면
 * 10^9 / 3 = (약) 10^8 * 3이다. 이는 1초당 10^8번 연산을 한다고 생각할 수 있다.
 * 그렇다면 이 문제는 250,000,000,000번 입력되는데 아래와 같이 내가 알고리즘을 구상했다면 시간복잡도가 O(N^2)으로
 * 2500초가 걸린다.
 */
public class num1764 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] strArr1 = new String[N];
        for(int i=0; i<N; i++){
            String str = sc.next();
            strArr1[i] = str;
        }
        String[] strArr2 = new String[M];
        for(int i=0; i<M; i++){
            String str = sc.next();
            strArr2[i] = str;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String name = strArr1[i];
            for(int j=0; j<M; j++){
                //==과 equals 비교하여 기억하기
                if(name.equals(strArr2[j]))
                    sb.append(name).append("\n");
            }
        }
        System.out.print(sb);
    }
}
