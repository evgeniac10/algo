package dataStruc;

import java.util.*;

/*
[1차시도 - 배열로 여는 괄호는 1을 더하고 닫는 괄호는 1을 빼서 0이 아닌 것은 NO를 출력한다 라고 생각했으나 , )( 이렇게 문제 조건에 맞지 않는
VPS를 생각하지 못하였다.]
[2차시도 - 스택 자료구조를 사용하여 1차시도에서 생각하지 못했던 닫는 괄호가 먼저 나오는 경우를 생각해보겠다.]
[2-1차시도 - 스택 자료구조에서 생각하지 못했던 부분은 문장열을 하나씩 진행한 수 스택을 비워주었어야하나 이를 생각지 못해서 그전에 값들이 저장된 채로 진행하여 원하는 값이 출력되지 못하였다.]
1.테스트 데이터 개수만큼 해당하는 int배열을 만든다.
2.해당하는 인덱스가 테스트 넘버가 될 것이다.
3.'('여는 괄호에 해당하면 인덱스안에 값을 1 더해준다. ')'닫는 괄호에 해당하면 인덱스 안에 값을 -1 해준다.
4.인덱스 0부터 배열의 길이만큼 배열 안에 값을 비교하여 0이라면 YES를 0이 아닌 다른 값이라면 NO를 출력해준다.
 */
public class num9012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] strs = new String[T];
        String[] result = new String[T];
        Arrays.fill(result,"YES");

        for(int i=0; i<T; i++){
            strs[i] = sc.next();
        }
        // 스택자료구조로 ( 라면 넣고 )라면 기존에 있던 괄호를 뺀다.
        //주의 할 점은 아무것도 없는 상태에서 )가 입력 되었다면 뺄 것이 없어 문제조건에 맞지 않아 NO를 출력한다.
        Stack<Character> charStack = new Stack<Character>();
        for(int index=0; index<strs.length; index++){
            //인덱스에 해당하는 문자열을 뽑아 문자 하나씩 조건에 맞게 스택에 넣고 뺀다.
            String tempStr = strs[index];
            for(int charIndex=0; charIndex<tempStr.length(); charIndex++){
                //'('라면 스택에 넣고 ')'라면 스택에서 뺀다.
                if('(' == tempStr.charAt(charIndex)){
                    charStack.push('(');
                }
                //스택이 비어있는 상태에서 ')' 넣는다면 조건에 맞지 않아서 NO를 result배열에 담는다.
                else if(charStack.isEmpty()){
                    result[index] = "NO";
                }
                //')'가 입력되어 비어 있지도 않으니 charStack에서 '('를 뺀다.
                else{
                    charStack.pop();
                }
            }
            //'(' 여는 괄호가 스택에 남아 있는 경우에도 문제 조건에 부합하지 않으니 NO을 저장해준다.
            if(!charStack.isEmpty()){
                result[index] = "NO";
                charStack.clear();
                continue;
            }
        }
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
