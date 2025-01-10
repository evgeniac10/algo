package dataStruc;

import java.util.ArrayList;

public class pro_12906 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for(int i=1; i<=arr.length-1; i++){
            if(arr[i-1] == arr[i]){
                continue;
            }
            list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        int i=0;
        for(int x: list){
            answer[i++]= x;
        }
        return answer;
    }
}
