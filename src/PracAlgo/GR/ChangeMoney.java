package PracAlgo.GR;

/*
거스름돈을 반환하는 프로그램을 만들어보자
-  money(거스름돈) , changeMoney[](거스름돈 종류를 담은 배열) , count (거스름 동전의 개수)
1. money와 changeMoney[index]를 비교하여 동전을 선택할지 말지 결정한다.
2. 거슬러줄 동전을 선택했다면 money에서 차감한 후 money가 0이 될 때까지 다시 1번부터 반복한다.
3. 거스를 동전의 개수 count를 이전 값과 비교하여 최소라면 바꿔준다.
 */
public class ChangeMoney {
    public static void main(String[] args) {
        int money=654;
        int[] changeMoney=new int[5];//500 , 100 , 50 , 10 , 1
        int count=0;
        //동전의 최소 개수를 위해서 가장 큰 금액 부터 거슬러야할 금액과 비교한다.
        for(int index=0; index<changeMoney.length; index++){
            //거스를금액이 해당 동전보다 크거나 같은 경우
            while(money>=changeMoney[index]){
                System.out.println("현재money의 값은 = " + money);
                money-=changeMoney[index];
                count++;
            }
        }
//        //거스를돈이 없다면 멈춘다.
//        if(money==0) break;
        System.out.println("거스를 동전의 최소 개수는 = "+count+"개 입니다.");
    }
}
