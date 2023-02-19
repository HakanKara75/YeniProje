package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M2 {
    public static void main(String[] args) {
 /*       Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
        bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
        yazınız.    */

              Scanner inp=new Scanner(System.in);
        System.out.println("Lutfen listede aramak istediginiz urunu girin");
        String aranan= inp.nextLine();
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        System.out.println(product.containsKey(aranan) ? "Aranan urun var": "Aranan urun yok");

 //2.yol
        String expectedProduct = aranan;
        if(product.containsKey(expectedProduct)){
            System.out.println(expectedProduct + " vardir");
        }else{
            System.out.println(expectedProduct + " yoktur");

    }
}
}