package loop_lambda;


import java.util.Scanner;
import java.util.stream.IntStream;

public class C05_forLoop_Lambda {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100den kucuk bir sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        IntStream.rangeClosed(1,sayi).filter(t->t%3==0).forEach(t-> System.out.print(t+" "));
    }
}
