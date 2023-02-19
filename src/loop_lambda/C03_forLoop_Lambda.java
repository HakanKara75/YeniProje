package loop_lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C03_forLoop_Lambda {
    public static void main(String[] args) {
 /*
 soru 3) 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
 */
        for (int i = 0; i <=100; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }else System.out.println(i);

        }
        System.out.println("\n");
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100den kucuk bir sayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }

        }

           IntStream.range(1,100).filter(t->t%3==0).forEach(t-> System.out.print(t+" "));





    }
}
