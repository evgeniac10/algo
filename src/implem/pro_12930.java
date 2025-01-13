package implem;
//https://school.programmers.co.kr/learn/courses/30/lessons/12930#
public class pro_12930 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int word =0;
            for(String str : s.split("")){
                word = str.contains(" ")? 0:word+1;
                answer += word%2 == 0? str.toLowerCase():str.toUpperCase();
            }
            return answer;
        }
    }
}
