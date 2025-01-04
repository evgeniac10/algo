package implem;

import java.io.*;
import java.util.*;

public class num17413 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean flag = false;

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = true;
            }else if(ch == '>'){
                sb.append(ch);
                flag = false;
                continue;
            }

            if(flag){
                sb.append(ch);
            }else if(!flag){
                if(ch == ' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }else{
                    stack.push(ch);
                }
            }

            if(i == str.length()-1){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        System.out.println(sb);
    }
}
