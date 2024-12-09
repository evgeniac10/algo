package PracAlgo;

import java.util.Arrays;

public class Permutat {
    static int[] inputNum = {1,2,3,4};
    static int[] output ;
    static boolean[] visited;

    public static void main(String[] args){

        int N = 4 ;
        int R = 3;

        visited = new boolean[N];
        output = new int[R];

        permu(0,N,R);
    }
    static void permu(int depth, int n, int r){

        // nPr는 n개중에 r개를 순서대로 나열하는 경우의 수
        // r개 -> 내가 뽑고 싶은 개수 , depth -> 얼만큼 뽑았는지 체크 가능
        if(depth == r) {
            System.out.println(Arrays.toString(output));
            return ;
        }

        for(int i=0; i<n; i++){

            // visited 배열로 n개 중에서 뽑아서 사용했느지 체크
            // 방문하지 않았다면 == 사용하지 않았다면
            if(!visited[i]){
                // 방문처리를 하고
                visited[i] = true;
                //순열의 결과를 담는 배열에다가 저장
                output[depth] = inputNum[i];
                //1개를 정했으니(depth+1) 다음 무엇을 정할지 재귀로 처음부터 찾기
                permu(depth+1 , n , r);
                //재귀를 나오게 되면서  for문으로 다음 숫자가 시작되기전에 초기화 해놓고 진행
                visited[i]=false;
            }
        }
    }
}
