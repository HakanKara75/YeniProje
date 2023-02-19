package ternary;

public class A5 {
    public static void main(String[] args) {
        /*Nested Ternary kullanarak;
Şifreyi kontrol etmek için kodu yazınız.
8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır. */
        String sifre="hgslekrjegnvle";
        boolean a= sifre.charAt(0)=='i';
        boolean b= sifre.charAt(0)=='k';
        String sekizMi= (sifre.length()> 8&& a==true) ? "8 karakterden fazla ve ilk harf 'i' dir":
        (sifre.length()> 8&& b==true ? "8 karakterden fazla ve ilk harf 'k' dir": "sartlar uymuyor");
        System.out.println(sekizMi);
    }
}
