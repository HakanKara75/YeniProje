package ternary;

public class A3 {
    public static void main(String[] args) {
        /*Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
 125 yukarı yuvarlanacak ve değer 130 olacaktır.
 123 aşağı yuvarlanacak ve değer 120 olacaktır. */
        int sayi=14;

        String yuvarla= sayi%10<5? "Son basamagi bir alt ondaliga yuvarla": "Son basamagi bir üst ondaliga yuvarla";
        System.out.println(yuvarla);


    }
}
