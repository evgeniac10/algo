package greed;

import java.util.*;

/**
 * 거스름돈의 동전의 개수를 최소로 하여야한다.
 * 동전의 개수를 최소로 할려면 어떻게 해야 할까
 * 거슬러줘야 할 금액에서 가장 큰 금액의 동전을 줄수록 남은 거스름 돈의 동전의 개수가 최소가 될 것이다.
 */
public class num2720 {
    //거슬러 줄 수 있는 돈의 종류
    static final int Quarter = 25;
    static final int Dime = 10;
    static final int Nickel = 5;
    static final int Penny = 1;

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<T; i++){
            int money = sc.nextInt();
            int[] coin = new int[4];

            while(money>=1) {
                if (money >= Quarter) {
                    money -= Quarter;
                    coin[0]++;
                    continue;
                } else if (money >= Dime) {
                    money -= Dime;
                    coin[1]++;
                    continue;
                } else if (money >= Nickel) {
                    money -= Nickel;
                    coin[2]++;
                    continue;
                } else if (money >= Penny) {
                    money -= Penny;
                    coin[3]++;
                    continue;
                }
            }
            for(int x : coin){
                sb.append(x).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
