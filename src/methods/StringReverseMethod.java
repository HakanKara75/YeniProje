package methods;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverseMethod {
    static String sonuc="";


    public static void main(String[] args) {
        metniTersineCevir();

    }
    public static void metniTersineCevir() {
        Scanner scan=new Scanner(System.in);
        System.out.println("yazi girin");
        String girilen=scan.nextLine();
        String []girilen1= girilen.trim().split("");
        for (int i = girilen1.length-1; i >-1 ; i--) {
             sonuc+=girilen1[i];
        }
        System.out.println(sonuc);
    }

}
