package loop_lambda;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L2 {
    public static void main(String[] args) {
        /*Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; accessories ´ ces */

        String aaaaa="kartalkalkardalsarkardalsarkarkartalakalkar";
        String b="";
        for (int i = 0; i < aaaaa.length(); i++) {
            String c=aaaaa.substring(i,i+1);
            if(!b.contains(c)){
                b+=c;
            }
        }
        System.out.println(b);

        aaaaa.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toSet()).forEach(System.out::print);


}

}