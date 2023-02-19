package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S3 {
    public static void main(String[] args) {
        /* Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
    Örnek: ‘Mississippi’ ´ Misp     */
String s = "Mississippi";
String []str=s.split("");

        Set<String> set= new HashSet<>(List.of(str));
        System.out.println(set);


        //2.Yol
        String st = "Mississippi";
        String[] ar = st.split("");
        List<String> character = Arrays.asList(ar);
        Set<String> mySets = new HashSet<>(character);
        System.out.println(mySets);

    }
}
