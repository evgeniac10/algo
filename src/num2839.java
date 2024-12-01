import java.util.Arrays;
public class num2839 {
    public static void main(String[] args){
        int inputSugar =6;
        delivery.memo = new int[inputSugar+1];

        Arrays.fill(delivery.memo,-1);

        int result = delivery.sugar(inputSugar);

        System.out.println(result == Integer.MAX_VALUE ? -1 : result);

    }
}
class delivery {

    static int memo[];
    static int sugar(int x) {

        //봉지에 설탕을 담으면 안되는데 담은경우 카운트가 되지 않도록(->유효한 카운트인지 검사 할때 필터링 됨)
        if(x<0) return Integer.MAX_VALUE;
        // 봉지에 담을 설탕이 0으로 없을때
        if(x==0) return 0;
        //memo배열에 초기에 -1로 할당해놨기에 봉지에 담지 못하는 것들은 여기서 함수가 종료됨
        if(memo[x] != -1)  return memo[x];


        int use3kg = sugar(x-3);
        int use5kg = sugar(x-5);

        //위에서 말했던 유효한 카운트인지 검사
        memo[x] = Integer.MAX_VALUE;
        if(use3kg != Integer.MAX_VALUE) memo[x] = Math.min(memo[x],use3kg + 1);
        if(use5kg != Integer.MAX_VALUE) memo[x] = Math.min(memo[x],use5kg + 1);

        return memo[x];
    }
}

