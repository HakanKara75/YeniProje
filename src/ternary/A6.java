package ternary;

public class A6 {
    public static void main(String[] args) {
        /*Bir sayının mutlak değerini hesaplamak için kodu yazınız.
Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız */
        int i = -5;
        int sonuc = i<0 ? -1*i : i;
        System.out.println(sonuc);

    }
}
