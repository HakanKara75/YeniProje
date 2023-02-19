package loop_lambda;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C12 {
    public static void main(String[] args) {
        /*String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 'Ali Can?' ==> l*i*a*n*
1. Yol: */

        String str="MerhaBa Hayat ARkadaslarR";
        String atr="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>96&&str.charAt(i)<123){
                atr+="*";
            }else {
                atr+=str.charAt(i);
            }

        }
        System.out.println(atr);
    }}