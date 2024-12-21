package Ztring;
import java.util.*;

/**
 * String 배열을 이용해서 제시된 단어를 저장한다.
 * 라이브러리를 이용하여 sort정렬을 하는데 길이가 같을경우에는 사전순으로 정렬하기 위해서
 * sort함수의 두번째인자에 Comparator객체를 커스텀해준다.
 */
public class num1181 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] strArr = new String[N];
        for(int i=0; i<N; i++){
            strArr[i] = sc.next();
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //길이가 같을경우에 사전 순으로
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                }
                //길이가 다를 경우 o1의 객체 길이가 길었다면 양수가 나올테니 o2 객체가 앞으로 와야한다.
                return o1.length() - o2.length();
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(strArr[i]);
        }

    }

}
