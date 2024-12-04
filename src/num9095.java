import java.util.*;

public class num9095 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] memo = new int[11];

        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        for (int index=4; index<11; index++){
            memo[index] = memo[index-3]+memo[index-2]+memo[index-1];
        }

        for(int i=0; i<T; i++){
            int N = sc.nextInt();
            System.out.println(memo[N]);
        }
    }
}
