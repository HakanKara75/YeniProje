package exceptions;

public class YasHataClass extends Exception{
    public YasHataClass(String msg){
        System.out.println(msg.toString());
        System.out.println("Yasi 18 den kucuk oldugu icin ehliyet alamaz");
    }

     /*
    RUNTIME EXCEPTION
    AritmeticException: sifira bolme gibi metamatiksel hatalari belirtir.
    NullPointerException: Henuz deger atamasi yapmadigimiz degiskenler uzerinde islem yapmaya calisilinca olur.
    IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
    ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
    IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
    NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
    ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
    StringIndexOutOfBoundsException: Bir String index'inin disina cikarsak aldigimiz hata
    UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.
    YasHataClass: eger javada checkAge methodunu cagirip yas kontrolu ypaarsak ve yas 18den kucuk ise bu hatayi aliriz
     */
}
