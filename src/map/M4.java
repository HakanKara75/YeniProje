package map;

import java.util.*;

public class M4 {
    public static void main(String[] args) {
        /*Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız. */
Map<String, Integer> product = new HashMap<>();
product.put("Laptop", 82);
product.put("TV", 53);
product.put("Refrigerator", 12);
product.put("Music System", 87);
product.put("Mobile Phone", 53);
Set<String> productNamesAsSet = product.keySet();
List<String> productNamesAsList = new ArrayList<>(productNamesAsSet);
Collections.sort(productNamesAsList);
System.out.println(productNamesAsList);

//2.yol
        List<String> pn = new ArrayList<>(productNamesAsSet);
pn.stream().sorted(Comparator.comparing(String::valueOf)).
        forEach(t -> System.out.print(t + " "));
    }
}
