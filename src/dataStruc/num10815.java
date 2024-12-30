package dataStruc;

import java.io.*;
import java.util.*;

public class num10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer token1 = new StringTokenizer(br.readLine());
        int[] NArray = new int[N];
        for(int i=0; i<N; i++){
            NArray[i] = Integer.parseInt(token1.nextToken());
        }
        Arrays.sort(NArray);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer token2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            int num = Integer.parseInt(token2.nextToken());
            sb.append(hasNum(NArray , num)).append(" ");
        }
        System.out.println(sb);
    }
    public static int hasNum(int[] arr , int num){
        int lo = 0;
        int hi = arr.length-1;

        while(lo <= hi){
            int midIndex = (lo + hi) / 2;
            int midValue = arr[midIndex];

            if(num < midValue){
                hi = midIndex - 1;
            }else if(num == midValue){
                return 1;
            }else{
                lo = midIndex + 1;
            }
        }
        return 0;
    }
}
