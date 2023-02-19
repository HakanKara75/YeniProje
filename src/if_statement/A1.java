package if_statement;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        /*Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Aralık, Ocak, Şubat için "Kış"
b) Mart, Nisan, Mayıs için "İlkbahar"
c) Haziran, Temmuz, Ağustos için "Yaz"
d) Eylül, Ekim, Kasım için "Sonbahar"
e) Diğerleri için "Geçersiz ay adı"*/
        Scanner input=new Scanner(System.in);
        String giris= input.nextLine();
        giris = giris.toLowerCase();
        if(giris.equals("aralik ") || giris.equals("ocak") || giris.equals("subat")){
            System.out.println("Kis");
        }else if(giris.equals("mart") || giris.equals("nisan") || giris.equals("mayis")){
            System.out.println("Ilkbahar");
        }else if(giris.equals("haziran") || giris.equals("temmuz") || giris.equals("agustos")){
            System.out.println("Yaz ");
        }else if(giris.equals("eylul") || giris.equals("ekim") || giris.equals("kasim")){
            System.out.println("Sonbahar ");
        }else{
            System.out.println("Gecersiz ay adi ");
    }
}
}
