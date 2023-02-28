package exceptions;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) throws YasHataClass{
        System.out.println("Ehliyet alma yasi kontrol uygulamasina hosgeldiniz");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age=scanner.nextInt();
        checkAge(age);
        System.out.println("Uygulama sonlandi.");
    }

    public static void checkAge(int age) throws YasHataClass {
        if (age<18){
            throw new YasHataClass("Ehliyet alamaz");

        }
    }

}
