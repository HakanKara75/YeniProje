package if_statement;

import java.util.Scanner;

public class A6_Donusturucu {
    public static void main(String[] args) {
    /*    Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km"
        yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
        kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinizde, konsolda kodunuz
        "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
     */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen donusecek degeri giriniz: \n" +
                "mil\n" +
                "fahrenayt\n" +
                "saniye\n");
        String operator = input.nextLine();

        if(operator.equals("mil")){
            System.out.println("mili giriniz");
            double mil= input.nextDouble();
            System.out.println(mil*1.60934+ " km");
        }else if(operator.equals("saniye")){
            System.out.println("saniyeyi giriniz");
            double saniye = input.nextDouble();
            System.out.println((saniye /60)/60+ "saat");
        }else if(operator.equals("fahrenayt")){
            System.out.println("fahrenayti giriniz");
            double fahrenayt= input.nextDouble();
            System.out.println((fahrenayt -32)*5/9+ " Santigarat");
    }
}
}