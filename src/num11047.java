import java.util.Scanner;

public class num11047 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] basket = new int[N];


        for(int i=0; i<N; i++){
            basket[i] = sc.nextInt();
        }

        int min = 0;

        for(int cnt=N-1; cnt>=0; cnt--){
            int index = cnt;
            while(K>=basket[index]) {
                K -= basket[index];
                min++;
                if(K<basket[index])
                    break;
            }
        }
        System.out.println(min);
    }
}
