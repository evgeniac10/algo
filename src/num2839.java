import java.io.*;
import java.util.*;

class calc{

    static int ppb(int x ){

        if ((x/5)>0){
            x-=5;
            return 1+ppb(x);
        }else if((x/3)>0){
            x-=3;
            return 1+ppb(x);
        }else{
            return -1;
        }
    }

}
public class num2839 {
    public static void main(String[] args){
        System.out.println(calc.ppb(18));
    }
}
