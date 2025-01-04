package implem;

import java.io.*;
import java.util.*;

public class num17413 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        while( token.hasMoreTokens() ){
            String str = token.nextToken();

            Stack<Character> stack = new Stack<>();
            Queue<Character> que = new LinkedList<>();

            for(int i=0; i<str.length();){
                char ch = str.charAt(i++);

                if(ch == '<' ){
                    que.add(ch);
                    ch = str.charAt(i++);
                    while(true){
                        que.add(ch);
                        ch = str.charAt(i++);
                        if(ch =='>'){
                            que.add(ch);
                            break;
                        }
                    }
                }
                while(!que.isEmpty()) {
                    sb.append(que.poll());
                }
            }
        }

        System.out.println(sb);
    }
}
