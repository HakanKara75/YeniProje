package for_each_loop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class F8 {
    public static void main(String[] args) {
        int [] [] arr = new int [2][4];
        arr[0] = new int [] {1, 3, 5, 7,};
        arr [1] = new int [] {1, 3};
        for (int[] a : arr) {
            for (int i : a){
                System.out.print(i + " ");

            }
            System.out.println();
    }
}
/*
Ciktisi ne olur?
 A. 1 3 5 7
    1 3
    B.  1 3
    1 3
    C. 1 3
    1 3 0 0
    D. 1 3
    followed by an ArrayIndexOutOfBoundsException
    E. Compilation

    cevap a
 */
}
