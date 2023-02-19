package loop_lambda;

import java.util.stream.IntStream;

public class C01_forLoop_Lambda {
    public static void main(String[] args) {
        /*
        Soru 1) Ekrana 10 kez "Java guzeldir" yazdirin
         */

        for (int i = 0; i < 10; i++) {
            System.out.println("Java guzeldir");
        }
        System.out.println();
IntStream.rangeClosed(1,10).forEach(t-> System.out.println("Java guzeldir"));
    }
}