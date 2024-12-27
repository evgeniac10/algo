package dataStruc;

import java.io.*;
import java.util.*;

/**
 * 문제의 입력값 범위를 보아하니 N은 최대 500,000 M도 최대 500,000인 것을 보아하니 이중for문을 사용한다면 시간초과가 날 것이 보였다.
 * N만큼 입력된 숫자를 큐에 담아 놓고
 *
 */
public class num10816 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(token.nextToken());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        token = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++){
            int searchNumber = Integer.parseInt(token.nextToken());
            sb.append( searchHigh(arr,searchNumber) - searchLow(arr,searchNumber));
        }
        System.out.println(sb);
    }
    public static int searchLow(int[] arr , int searchNumber){
        int start = 0;
        int finish = arr.length;

        while(start < finish){

            //mid를 구할때 이렇게 하는 이유는 start + finish를 할 경우 stackOverflow가 발생할 수 있기 때문입니다.
            int mid = start + ((finish - start) / 2);

            if(searchNumber <= arr[mid]){
                finish = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    public static int searchHigh(int[] arr , int searchNumber){
        int start = 0;
        int finish = arr.length;

        while(start < finish){

            //mid를 구할때 이렇게 하는 이유는 start + finish를 할 경우 stackOverflow가 발생할 수 있기 때문입니다.
            int mid = start + ((finish - start) / 2);

            if(searchNumber < arr[mid]){
                finish = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
