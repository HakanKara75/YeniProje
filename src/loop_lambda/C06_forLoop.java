package loop_lambda;
import java.util.Scanner;
import java.util.stream.IntStream;

public class C06_forLoop {
    public static void main(String[] args) {
        /* Soru 6) Kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar
        3'un veya 5"in kati olan sayilari yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if ((i%3==0)||(i%5==0)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        IntStream.rangeClosed(1, sayi).filter(t->t%3==0||t%5==0).forEach(t-> System.out.print(t+ " "));

    }
}