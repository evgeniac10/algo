import java.util.*;


public class num10773 {
    public static void main(String[] args) {
        /*
        문제를 보자마자 스택 자료구조를 사용해야겠다고 생각했다.
        그 이유는 가장 최근에 쓴 수를 지운다 -> 스택 구조에서 가장 위에있는
        다시말해 LIFO(Last in Fisrt Out)를 나타낸다.
         */
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int K = sc.nextInt();
        int result=0;

        /*
        K만큼 반복하여 스택구조에 숫자를 넣는데
        0일경우 스택에 있는 숫자를 꺼낸다. 0이 아닐경우 스택에 숫자를 넣는다.
        마지막으로 스택에 남아있는 숫자를 모두 다 더해서 result 에 담아 출력한다.
         */
        for(int i=0; i<K; i++){
            int num=sc.nextInt();
                //입력되는 정수는 0아니면 모두 다 양수이기에
                if(num>0)   {
                    stack.push(num);
                }
                //스택이 비어있는 경우에 pop()을 한다면 에러가 발생한다.(발견하지 못했던 문제점)
                if(stack.isEmpty())    {
                    continue;
                }
                //입력받은 정수가 0이고 스택이 비어있지 않으니 꺼내어준다.
                stack.pop();
        }
        for(int j=0;j<stack.size();j++){
            result+=stack.pop();
        }
        System.out.println(result);
    }
}
