package ternary;

public class A2 {
    public static void main(String[] args) {
        /*Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen " */
        int bir=6;
        int iki=4;
        int uc=4;
        String nasilUcgen=(bir==iki&&iki==uc ? "eskanar": (bir==iki||iki==uc ? "ikizkenar ucgen": "cesitkenar"));
        System.out.println(nasilUcgen);
    }
}
