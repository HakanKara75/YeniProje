package loop_lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C09_forLoop_Lambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num= scan.nextInt();
        IntStream.rangeClosed(1, 10).map(t->t*num).forEach(t-> System.out.println(t));
    /*
    belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
     */
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(sayi+" X "+i+" = "+sayi*i);
        }
    }
    }

