package stringmanipulation;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        /*Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
sembol olmalıdır.
Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
 '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
 '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
 '! a b 3 k' kodunuz konsolda false yazdırmalıdır.*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen icinde en az 1 sembol olan ve en az 8 karakterli sifreyi giriniz");
        String sifre=input.nextLine();
       String sifre1=sifre.trim().replaceAll(" ", "");
       int ilk= sifre1.length();
        if (ilk<8){
            System.out.println("sifre en az 8 karakter olmali");
        }
int iki= sifre1.replaceAll("[\\p{Punct}]", "").length();
        if (ilk==iki){
            System.out.println("sifrede en az bir tane sembol olmalidir.");
        }

    }
}
