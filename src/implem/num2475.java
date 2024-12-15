package implem;

import java.util.*;
/*
입력 받은 숫자를 제곱하여 합하는 sum변수를 만든뒤
sum에서 %10으로 나눈 나머지를 출력한다.
 */
public class num2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            sum += (num * num);
        }
        System.out.println(sum%10);
    }
}
