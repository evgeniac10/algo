package greed;

import java.util.*;

/*
사용시간표와 동일한 int배열을 만든 뒤 각 배열에는 초기값으로 0으로 세팅
사용 하는 시간을 인덱스라고 생각하고 해당 인덱스에 값을 넣는다.
하나의 회의가 종료되면 1을 추가하여 다음 회의가 시작될때 int배열에 값에다가는 추가된 값을 넣는다.
그리디는 현재 상황에서 제일 최선의 선택을 고르는것이다. 이 경우 최대한 많은 회의를 진행해야하니 짧은 회의시간을 갖는것이 가장 베스트일거 같다.
시작시간부터 끝나는 시간까지는 사용이 불가능하다.
시작,끝나는 시간은 범위가 0부터 2^31까지이다. 편의를 위해 시작시간과 끝나는 시간을 한 세트로 묶어서 표현하겠다.
입력받은 시간들중에서 끝나는 시간에서 시작시간을 빼서 차이가 가장 적은 순서대로 배열한 뒤
{시작시간,끝나는시간}을 한 개씩 꺼내어 boolean배열로 사용을 표시
int배열에는 사용회수를 나타내는 cnt를 사용하여 회의 사용 횟수를 기억한다.
 */

public class num1931 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //차이를 저장할 배열
        int[] diff = new int[N];

        for(int i=0; i<N; i++) {
            int startTime = sc.nextInt();
            int finishTime = sc.nextInt();
        }
    }
}
