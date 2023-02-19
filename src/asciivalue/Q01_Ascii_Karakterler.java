package asciivalue;

public class Q01_Ascii_Karakterler {
    /*Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
yazdırınız.
Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

*/
    public static void main(String[] args) {


    String isim = "Ali Can";
    isim= isim.trim();
    isim=isim.replace(isim.substring(0,1), "").replace(isim.substring(isim.length()-1), "");

            System.out.println(isim); //li Ca
}
}