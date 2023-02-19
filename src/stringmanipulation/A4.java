package stringmanipulation;

public class A4 {
    public static void main(String[] args) {
        /*Verilen bir ismin adı ve soyadı ayrı ayrı alan kodu yazınız.
         */
        String isim= "Hakan Kara";
        String ad=isim.substring(0, isim.indexOf(" "));
        System.out.println(ad);
        String soyad= isim.substring(isim.indexOf(" ")+1, isim.length());
        System.out.println(soyad);
    }
}
