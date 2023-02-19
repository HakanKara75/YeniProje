package loop_lambda;

import java.util.Comparator;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class L1 {
    public static void main(String[] args) {
        /* 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız. */
        int start = 11;  // inclusive
        int end = 121;    // exclusive

        IntStream.range(start, end)
                .map(i -> start + (end - 1 - i)).filter(t->t%4==0&&t%6==0)
                .forEach(System.out::println);


        for (int i = 120; i >10 ; i--) {
            if (i%4==0&&i%6==0){
                System.out.print(i+" ");
            }

        }int a=0;
        do{
            String result="";
            for (char i = 'C'; i >='A' ; i--) {
                result+=i;
                a++;
            }
            System.out.println(result);
        }while (a==3);

    }
}
