package if_statement;

import java.util.Scanner;

public class A5 {
    /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen" */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen ucgen icin birinci kenar uzunlugunu giriniz");
        int ilk= input.nextInt();
        System.out.println("lutfen ucgen icin ikinci kenar uzunlugunu giriniz");
        int iki= input.nextInt();
        System.out.println("lutfen ucgen icin ucuncu kenar uzunlugunu giriniz");
        int uc= input.nextInt();

if (ilk == iki && iki == uc) {
System.out.println("Eskenar Ucgen");
} else if (ilk == iki && iki != uc || ilk == uc && iki != uc || iki == uc && ilk != uc) {
System.out.println("Ikizkenar Ucgen ");
} else {
System.out.println("Cesit Kenar Ucgen ");
}

} }
