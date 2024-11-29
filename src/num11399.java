import java.io.*;
import java.util.*;

public class num11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] human = new int[N];

        ArrayList<Integer> minSUM = new ArrayList<>();

        StringTokenizer token = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            human[i] = Integer.parseInt(token.nextToken());
        }
        Arrays.sort(human);

//        for(int x : human){
//            minSUM.add(x);
//        }
        int temp =0;
        int result =0;

        for(int index=0; index<=human.length-1; index++){
            int min = Integer.MAX_VALUE;

            for(int searchMin =index; searchMin<=human.length-1; searchMin++){
                if(min>=human[searchMin]){
                    min = human[searchMin];
                }
            }

            temp = min;
            result = result + temp;
            minSUM.add(result);
        }
        result =0;
        for(int x : minSUM){
            result+=x;
        }
        System.out.println(result);
    }
}
