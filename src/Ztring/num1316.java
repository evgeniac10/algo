package Ztring;

import java.util.*;

/**
 * 문제에서 문자에 대한 그룹인지를 확인한다. 여기서 말하는 그룹이란 나온 문자에대해서 연속적으로 나와야한다.
 * 예를 들어서 aaabbbccc이면 그룹문자이다. 그러나 aaabbbccca라면 a는 연속적이지 않기에 그룹문자가 아니다.
 * boolean 타입의 배열을 이용하여 문자가 기존의 사용한 적이 있는지 확인을 한다.
 * 사용한 적이 있는지 확인하고 없다면 사용처리를 한 뒤에 다음 문자로 넘어간다.
 * 있다면 찾는 그룹 단어가 아니니 다음 문장으로 넘어가도록 한다.
 */
public class num1316 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt=N;

        for(int i=0;i<N;i++){
            //alphabet 배열은 문장에서 알파벳이 사용되었는지를 확인 해 줄 수 있는 배열이다.인덱스번호는 곧 알파벳을 뜻한다.
            boolean[] alphabet = new boolean[26];
            String str = sc.next();
            int preChar = 0;

            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                int nowChar = ch - 'a';
                //직전 문자와 현재 문자가 같지 않다면 사용한 적이 있는지 없는지 확인한다.
                if(preChar != nowChar){
                    preChar = nowChar;
                    //같지 않은 상태인데 사용한 적이 있다 == 그룹단어 아니다.
                    if(alphabet[nowChar]){
                        cnt--;
                        break;
                    }
                    //같지 않은 상태인데 사용한 적이 없다 == 다음 문자로 넘어가도 좋다.
                    else{
                        alphabet[nowChar] = true;
                        continue;
                    }
                }
                //사용한 적이 없는 알파벳은 사용 처리 해주고 직전 문자를 나타내는 preChar에다가 넣어주기
                else{
                    preChar = nowChar;
                    continue;
                }
            }

        }
        System.out.println(cnt);
    }
}
