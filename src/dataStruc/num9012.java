package dataStruc;

import java.util.*;

/*
1.테스트 데이터 개수만큼 해당하는 int배열을 만든다.
2.해당하는 인덱스가 테스트 넘버가 될 것이다.
3.'('여는 괄호에 해당하면 인덱스안에 값을 1 더해준다. ')'닫는 괄호에 해당하면 인덱스 안에 값을 -1 해준다.
4.인덱스 0부터 배열의 길이만큼 배열 안에 값을 비교하여 0이라면 YES를 0이 아닌 다른 값이라면 NO를 출력해준다.
 */
public class num9012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        String[] strs = new String[T];

        for(int i=0; i<T; i++){
            strs[i] = sc.next();
        }
        //입력받은 String 배열의 strs에서 하나씩 꺼내어 괄호의 수가 맞는지 체크한다.
        for(int j=0; j<strs.length; j++){
            String test = strs[j];
            for(int k=0; k<test.length(); k++){
                char ch = test.charAt(k);
                if(ch =='('){
                    arr[j]++;
                }else{
                    arr[j]--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
