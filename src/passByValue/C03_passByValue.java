package passByValue;

import java.util.Arrays;

public class C03_passByValue {
    public static void main(String[] args) {

        int [] b={2,5};
        sayiyiDegistir(b);
        System.out.println(b[0]); //7
/*
tek bir eleman metot icinde degismis. passbyvalue bunu kabul eder.
eger b=a olsaydi bunu kabul etmez. cunku heap memorydeki b iptal edilip a oluyor. b nin stack deki referansi
da iptal oluyor. java buna izin vermez. bu tur islem sadece kendi skopu icinde gecerlidir.
 */


    }

    public static void sayiyiDegistir(int[] a) {
        a[0]=7;
//
    }
}
