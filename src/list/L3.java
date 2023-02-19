package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L3 {
    public static void main(String[] args) {
     /*    Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70       */
        List<String > say = new ArrayList<>();
        say.add("$12.99");
        say.add("$8.25");
        say.add("$23.60");
        say.add("$54.45");

        List<Double > fiyat = new ArrayList<>();
        for (String w:say) {
            Double dbl= Double.valueOf(w.replace("$", ""));
            fiyat.add(dbl);
        }
        Collections.sort(fiyat);
        Double sum=fiyat.get(0)+ fiyat.get(fiyat.size()-1);
        System.out.println(sum);
    }
}
