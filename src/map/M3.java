package map;

import java.util.*;
import java.util.stream.Stream;

public class M3 {
    public static void main(String[] args) {
 /*       Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.*/
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        List<String> list = new ArrayList<>(product.keySet());
        List<Integer> liste = new ArrayList<>(product.values());

        liste.stream().
                sorted(Comparator.comparing(Integer::valueOf)).
                forEach(t -> System.out.print(t + " "));

//      2.yol
        Object[] productNumber = product.values().toArray();
        Arrays.sort(productNumber);
        System.out.println(Arrays.toString(productNumber));
    }
}
