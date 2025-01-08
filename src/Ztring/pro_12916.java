package Ztring;

import java.util.stream.IntStream;

public class pro_12916 {
    public static void main(String[] args){
        String str = "pPooooyY";
        str = str.toUpperCase();
        IntStream pStream = str.chars().filter(e -> 'P' == e);
        IntStream yStream = str.chars().filter(e -> 'Y' == e);
        if(pStream.count() == yStream.count()) System.out.println(true);
        System.out.println(false);

    }
}
