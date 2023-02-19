package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class M1 {
    public static void main(String[] args) {
/*        Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız. */
                Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 55);
        product.put("Music System", 87);

        Collection<Integer> numOfProducts = product.values();

        Integer sum = 0;
        for(Integer w : numOfProducts){
            sum = sum + w;
        }
        System.out.println(sum);
    }
}
