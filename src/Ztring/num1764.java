package Ztring;

import java.util.*;
import java.io.*;

/**
 * 입력값이 N은 500,000 M은 500,000이다. 그래서 입력횟수가 250,000,000,000번이다.
 * 컴퓨터가 평균적으로 연산을 1초에 10^8번 실행하는데 현재 프로세스는 평균적으로 초당 10GHz단위로 연산을 처리한다.
 * 10GHz = 10^9Hz이고 컴퓨터가 연산을 처리하는데 2-3클럭을 사용한다라고 한다면
 * 10^9 / 3 = (약) 10^8 * 3이다. 이는 1초당 10^8번 연산을 한다고 생각할 수 있다.
 * 그렇다면 이 문제는 250,000,000,000번 입력되는데 아래와 같이 내가 알고리즘을 구상했다면 시간복잡도가 O(N^2)으로
 * 2500초가 걸린다.
 *
 * 해쉬 맵 자료구조를 이용하여 시간복잡도를 O(N)으로 변경한다면 시간초과가 나지 않을것이다.
 */
public class num1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<N; i++){
            StringTokenizer nameToken = new StringTokenizer(br.readLine());
            String name = nameToken.nextToken();
            map.put(name,1);
        }

        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        for(int j=0; j<M; j++){
            StringTokenizer nameToken = new StringTokenizer(br.readLine());
            String name = nameToken.nextToken();
            if(map.containsKey(name)){
                cnt++;
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for(int size =0; size<list.size(); size++){
            System.out.println(list.get(size));
        }



    }
}
