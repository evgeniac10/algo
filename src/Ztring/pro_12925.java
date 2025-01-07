package Ztring;
import java.util.*;
//https://school.programmers.co.kr/learn/courses/30/lessons/12925
public class pro_12925 {
    /*
    문제를 읽고 Java.uitl 패키지에 있는 Integer.parseInt()를 쓰긴했지만 이렇게 푸는게 아닌거 같다는 생각이 들었다.
    그래서 다른 사람의 풀이를 보면 다시 한번 복습해보았다.
    테스트케이스 "1234" , "-1234"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;
        boolean flag = false;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='-'){
                flag = true;
            }
            //입력한 값이 양수인경우 flag는 그대로 두고 숫자만 채워 넣는다.
            else if(ch != '+'){
                result = result * 10 + (ch - '0');
            }
        }
        result = flag ? -1*result : result;
        System.out.println(result);
    }
}
