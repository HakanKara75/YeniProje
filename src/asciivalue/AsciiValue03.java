package asciivalue;

import java.util.Scanner;

public class AsciiValue03 {
    public static void main(String[] args) {


    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.


    Scanner input = new Scanner(System.in);
            System.out.println("İlk karakteri giriniz");
    char ch1 = input.next().charAt(0);
            System.out.println("İkinici karakteri giriniz");
    char ch2 = input.next().charAt(0);

    int ilk = Math.min(ch1, ch2);
    int ikinici = Math.max(ch1, ch2);

            for (int i = ilk + 1; i < ikinici; i++) {

        System.out.print((char) i + " ");

    }
}
}
