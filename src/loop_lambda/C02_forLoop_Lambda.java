package loop_lambda;

import java.util.stream.IntStream;

public class C02_forLoop_Lambda {
    public static void main(String[] args) {


    /*
    Soru 2) 10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin
     */
        int bas = 20;
        int son = 50;
        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i+",");

            }else System.out.print(i);


        }

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
        System.out.println();
        IntStream.rangeClosed(1,100).filter(t->t%3==0).forEach(t-> System.out.print(t+" "));
        System.out.println();
        IntStream.range(1,100).filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }
}
