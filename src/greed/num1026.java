package greed;

import java.io.*;
import java.util.*;
/**
 * 각 배열을 같은 순서끼리 곱하여 다 더한 값을 S라고 한다.
 * S가 최소한이 나오기 위해서는 곱해지는 숫자가 작을 수록 더하는 연산도 작은 값을 더하게 된다.
 * 그렇다면 어떻게 곱해지는 숫자가 작을 수 있을까 이는 둘 다 작은 수라면 작겠지만 작은 수끼리 곱하면 나중에는 큰 숫자끼리 곱하게 된다.
 * 이 방법 보단 작은 숫자와 큰숫자를 곱한값이 나중에 더하기까지 생각했을때 더 작을 것으로 예상한다.
 * 그리디 문제로 곱하기를 어떤 숫자를 선택할지 그 순간 가장 최선의 선택을 하는것이 중요하다.
 */
public class num1026 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] brr = new int[N];

        StringTokenizer tokenOne = new StringTokenizer(br.readLine());
        StringTokenizer tokenTwo = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(tokenOne.nextToken());
            brr[i] = Integer.parseInt(tokenTwo.nextToken());
        }
        Arrays.sort(arr);
        Arrays.sort(brr);//오름차순으로 정렬후 순서 바꾸기
        for(int i=0; i< N/2; i++){
            int temp = brr[i];
            brr[i] = brr[N-1-i];
            brr[N-1-i] = temp;
        }

        StringBuilder sb = new StringBuilder();
        int result = 0;
        for(int index =0; index<arr.length; index++){
            result += arr[index] * brr[index];
        }
        sb.append(result);
        System.out.println(sb);

    }
}
