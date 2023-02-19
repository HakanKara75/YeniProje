package loop_lambda;

import java.util.Map;
import java.util.stream.Collectors;

public class L3 {
    public static void main(String[] args) {
        //string de tekrarli elemanlari bulma
        String aaaaa="kartalkalkardalsarkardalsarkarkartalakalkar";
        Map< Character, Long > result = aaaaa
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v >0 && v< 3) {
                System.out.println(k + " : " + v);
            }
        });
    }
}
