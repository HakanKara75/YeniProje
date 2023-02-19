package asciivalue;

public class AsciiValue07 {
    public static void main(String[] args) {
        /*Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
olmadığını kontrol etmek için kod yazınız.
Örnek:‘Ali Can’ için konsolda false yazmalıdır.
 ‘ Ali Can ’ için konsolda false yazmalıdır.
 ‘ Ali Can ’ için konsolda false yazmalıdır.
 ‘Ali Can’ için konsolda true yazmalıdır. */

        String isim= " Ali Can ";
        isim=isim.trim();
        int ilk=isim.length();
        int iki= isim.replaceAll(" ", "").length();
        boolean esitMi=ilk==iki;
        System.out.println(esitMi); //false
    }
}
