package implem;

import java.util.*;

/*
문제에서 대소문자 구분을 하지 않는다 라고 하였으니
1.입력된 문장을 모두 대문자로 바꾼다.
2.영어의 알파벳 개수만큼 배열의 크기를 만든다.
3.알파벳 순서대로 나열하여 주어진 문장에서 해당하는 알파벳이 있는경우 1을 더한다.(알파벳 A는 인덱스0에 해당한다.)
4.배열에서 가장 큰 값을 가진 인덱스를 찾고 그에 해당하는 알파벳을 찾는다.
5.큰 값을 가진 것이 두개 이상 일 경우 ?를 출력한다.
 */

public class num1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] alphabet = new int[26];

        String upperStr = str.toUpperCase();
        //알파벳 순서대로 나열하여 주어진 문장에서 해당하는 알파벳이 있는 경우 1을 더한다.
        for (int i = 0; i < str.length(); i++) {
            //대문자 A는 아스키코드 값으로 65에 해당한다.
            alphabet[upperStr.charAt(i) - 65]++;
        }
        //가장 많이 사용된 알파벳 (인덱스)를 찾아야한다 -> 사용이 많이 된 만큼 alphabet 배열의 값이 클것이다.
        //alphabet배열의 값 중에서 가장 큰 값이 있을텐데 해당하는 값의 인덱스가 여러개라면 물음표 한개라면 해당 인덱스에다가 65를 더해서 출력
        int max = 0;
        for(int j=0; j<alphabet.length; j++){
            if(max < alphabet[j]){
                max = alphabet[j];
            }
        }
        //배열 중 큰 값을 갖는 인덱스 찾기
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int k=0; k<alphabet.length; k++){
            if(max == alphabet[k]){
                list.add(k);
            }
        }
        if(list.size()>1) System.out.println("?");
        else{
            System.out.println((char)(list.get(0)+65));
        }
    }
}
