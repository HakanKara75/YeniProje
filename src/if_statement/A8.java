package if_statement;

import java.awt.font.ShapeGraphicAttribute;

public class A8 {
    public static void main(String[] args) {
        /*ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz,
"Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır
         */

        String a="KF";
        String e= a.replaceAll("[A-Z]", "");
        if (a.length()>2){
            System.out.println("kisaltma 2 harf olmalidir");
        }
        if (a.charAt(0)>'a'&&a.charAt(0)<'z'||
                a.charAt(1)>'a'&&a.charAt(1)<'z'){
            System.out.println("kucuk harf iceremez");
        }
if (e.length()<2){
            System.out.println("karakter icermemelidir");
        }
    }
}
