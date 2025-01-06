package Sort;

import java.io.*;
import java.util.*;

/**
 * 문제 정의 :
 * 1. 물체의 최대 중량(maxWeight)을 구하는 프로그램
 * 2. 로프가 들 수 있는 중량(ropeWeight)을 넘어설 수는 없음
 * 3. 모든 로프를 쓸 필요가 없음
 *
 * 최대 중량 = 사용하는 로프의 중량 중에서 최솟값 * 로프의 개수
 * 예시) 로프 20 30 30 30 중에서 내림차순으로 정렬하면 30 30 30 20 으로 정렬되어 먼저 30 1개만 사용할 경우
 * 최대 중량 = 30 * 1 = 30
 * 최대 중량 = 30 * 2 = 60
 * 최대 중량 = 30 * 3 = 90
 * 최대 중량 = 20 * 4 = 80
 */
public class num2217 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] ropeWeight = new Integer[N];

        for(int i=0; i<N; i++){
            ropeWeight[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropeWeight,Collections.reverseOrder());

        int maxWeight  = 0;

        //내림차순으로 정리했기 때문에 뒤로 갈 수록 배열 안에 값은 점차 작아지지만 앞에 로프들은 당연히 그만큼 중량을 들을 수 있음
        for(int i=0; i<ropeWeight.length; i++){
            maxWeight = Math.max(maxWeight , ropeWeight[i] * (i+1));
        }

        System.out.println(maxWeight);
    }
}
