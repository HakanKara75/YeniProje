package asciivalue;

import java.util.Locale;

public class AsciiValue05 {
    public static void main(String[] args) {
        /*
Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
büyük harfle yazdırınız.
Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */

        String a= "Merhaba";
        char ba= a.charAt(a.length()-1);
        System.out.println(ba);
        String b=a.replace(a.substring(a.length()-1), "");
        System.out.println(b.toUpperCase(Locale.ROOT)+ba);

//2.yol
        String s = "Java";
        Integer sonKrkIndex = s.length()-1;
        String sonKrkDisindakiler = s.substring(0, sonKrkIndex).toUpperCase();
        System.out.println("son karakter disindaki tum karakterler buyuk harf ile : " + sonKrkDisindakiler);
    }
}
