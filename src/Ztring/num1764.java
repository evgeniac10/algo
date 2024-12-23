package Ztring;

import java.util.*;

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
