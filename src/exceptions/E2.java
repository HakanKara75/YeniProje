package exceptions;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) throws YasHataClass{
        System.out.println("Ehliyet alma yasi kontrol uygulamasina hosgeldiniz");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age=scanner.nextInt();
        E1.checkAge(age);
        System.out.println("Uygulama sonlandi.");
    }
}
