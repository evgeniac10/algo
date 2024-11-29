import java.io.*;

public class num14916 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int coin = 0;

        while(true){
            if(n<5){
                break;
            }
            n-=5;
            coin++;
        }
        while(true){
            if(n<2){
                break;
            }
            n-=2;
            coin++;
        }
        if(coin>0)
            System.out.println(coin);
        else
            System.out.println(-1);

    }
}
