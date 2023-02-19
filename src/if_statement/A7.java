package if_statement;

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        /*Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
yazmalıdır.
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
yazmalıdır.
Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
"Geçersiz Ad"*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ismi giriniz: ");
        String operator = input.nextLine();
        String adinIlkHarfi = operator.substring(0,1);
        int spaceIndex=operator.indexOf(" ");
        int sonindex= operator.lastIndexOf("");
        String adinIkincikHarfi = operator.substring(1,2);
        String soyAdinIkincikHarfi = operator.substring(spaceIndex+2,spaceIndex+3);

        int opLng=operator.length();
        String operator2= operator.replaceAll(" ", "");
int o2Lng=operator2.length();
boolean fark=opLng-o2Lng>=3;

String chr=operator.replaceAll("[\\p{Punct}]", "");
int chrLng=chr.length();
boolean fark2=opLng!=chrLng;


        if (adinIlkHarfi.charAt(0)>='a'&& adinIlkHarfi.charAt(0)<'z'){
            System.out.println("Bas harflerinde hata var. ilk harf buyuk olmali");
        }if (spaceIndex<1){
            System.out.println("soyisim de isim ile birlikte yazilmalidir");
        }if (adinIkincikHarfi.charAt(0)>='A'&& adinIkincikHarfi.charAt(0)<'Z'||
                soyAdinIkincikHarfi.charAt(0)>='A'&& soyAdinIkincikHarfi.charAt(0)<'Z'){
            System.out.println("ismin ilk harfleri haric diger harfler kucuk olmalidir");
        }if (fark==true){
            System.out.println("isim ve soyisim icinde bosluk barindirmamali");
        }if (fark2==true){
            System.out.println("isim harf disinda karakter barindirmamali");
        }



    }
}
