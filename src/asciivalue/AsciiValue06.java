package asciivalue;

public class AsciiValue06 {
    public static void main(String[] args) {
        /*Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
karakterleri büyük harflerle yazdırınız.
Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.*/

        String ilk="Merhaba";
        ilk=ilk.toLowerCase();
        int iki=ilk.length()-1;
        System.out.println(ilk.substring(1, iki).toUpperCase());


    }
}
