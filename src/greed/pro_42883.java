package greed;

import java.util.Stack;

public class pro_42883 {
    public static void main(String[] args) {
        //https://school.programmers.co.kr/learn/courses/30/lessons/42883#
        //2025.01.29(수) - 테스트 9번 (시간초과) , 테스트 12번 (실패)
    }
    public String solution(String number, int k) {
        String answer = "";
        int left_number = number.length()-k;
        //스택 자료구조를 사용한다. 대소비교를 위해 Integer를 사용한다.
        Stack<Integer> st = new Stack<>();

        for(char ch : number.toCharArray()){
            int num = Character.getNumericValue(ch);
            if(st.isEmpty()){
                st.push(num);
                continue;
            }
            //스택에 채워진 숫자가 들어오려는 숫자보다 작다면 빼고 큰 값으로 넣기
            while(!st.isEmpty() && st.peek()<num){
                if(k==0) break;
                st.pop();
                k--;
            }
            st.push(num);

        }

        for(int x: st){
            answer= answer+(x+"");
        }
        return answer;
    }

}
