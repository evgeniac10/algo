package dataStruc;

import java.io.*;
import java.util.*;

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
            sb.append( searchHigh(arr,searchNumber) - searchLow(arr,searchNumber)).append(" ");
        }
        System.out.println(sb);
    }
    public static int searchLow(int[] arr , int searchNumber){
        int start = 0;
        int finish = arr.length;

        while(start < finish){

            //mid를 구할때 이렇게 하는 이유는 start + finish를 할 경우 stackOㅈverflow가 발생할 수 있기 때문입니다.
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
                start = mid+1;
            }
        }
        return start;
    }
}
