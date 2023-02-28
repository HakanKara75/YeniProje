package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E {
      /*
    exception lar handle edilebilir.
    error lar handle edilemez.
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=0;
        int sayi2=20;
        try{
            System.out.println("Try bloguna hosgeldiniz");
            sayi=scanner.nextInt(sayi);
            System.out.println(sayi2/sayi); //matematik hatasi
            System.out.println("Try blogunu asabildiniz ve verdiginiz deger icin calisiyor"+ sayi); //string girilirse hata verir
        }catch (InputMismatchException e){
            System.out.println("Try blogunu asamadi ve hata aldik.");
            throw new InputMismatchException("sayi degeri girmeniz gerekirken farkli bir deger girdiniz.");
        }catch (ArithmeticException e){
            System.out.println("bolme isleminde hata var");
            throw new ArithmeticException("lutfen sayiyi 0'dan farkli bir deger giriniz.");
        }finally {
            System.out.println("ne olursa olsun burasi calisir");
        }


        System.out.println(sayi);
    }
}