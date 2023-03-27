package passByValue;

import java.util.Arrays;
import java.util.Locale;

public class C05 {
    public static void main(String[] args) {
        String str= "Java";
        int arr []= {1,2,3};

        method1(str); //islem gecersiz.
        method2(arr);
        System.out.println(Arrays.toString(arr)); // method2 deki deger degisimi nedeniyle [1, 4, 3]
        method3(arr); //islem gecersiz
        System.out.println(Arrays.toString(arr));// method2 deki deger degisimi nedeniyle [1, 4, 3]
        System.out.println(str); //Java

    }
    private static void method3(int arr []){
        int yeniArr[]={10,11,12,13};
        arr=yeniArr;
/*
burada heap memory'deki yenirArr atama yoluyla arr'ye verildiginden stack'teki referans silinir. yeni referans
yeniArr'nin referansi olur, onun da ismi heap'te arr olur. bu nedenle passbyvalue geregi bu islem javada gerceklemez.
degeri degil kutunun kendisini degistiriyor.
 */
    }

    private static void method2(int arr []){
        arr[1]= 4;
        arr[2]=3;
/* passbyvalue geregi variable degismedigi sadece degerleri degistigi icin bu main icindeki arr'yi etkiler.
elemanlar degisir. main icindekini etkiler. heap memory'deki arr oldugu yerde durdugundan stack'teki referans
bu degerleri yerine koyar.
 */
    }

    private static void method1(String str){
        str=str.toUpperCase();
/*
bu metot yukaridaki str'yi buyuk harf yapar. ama passbyvalue skop nedeniyle bu str main icinde kullanılmaz. bu metotta
sadece str'nin degeri kullanilir. atanan str maini etkilemez. print komutu olsaydi bu metot icinde str buyuk harf yazdirirdi.
 */
    }
}
