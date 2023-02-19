package stringmanipulation;

public class A3 {
    public static void main(String[] args) {
        /*Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
Not: İkinci isim kapsam dışındadır.
         */
        String isim= "Hakan Kara";
        String ad=isim.substring(0, 1);
        System.out.println(ad);
        String soyad= isim.substring(isim.indexOf(" ")+1, isim.indexOf(" ")+2);
        System.out.println(soyad);

       // 2.Yol:
        String isim1 = "Tom Hanks";
        String adIlkHarf = isim1.substring(0,1);
        String soyadIlkHarf = isim1.split(" ")[1].substring(0, 1);
        System.out.println(adIlkHarf + soyadIlkHarf);
    }
}
