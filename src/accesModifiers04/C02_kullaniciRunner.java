package accesModifiers04;

import accesModifiers03.C01_kullanici;
public class C02_kullaniciRunner {
    public static void main(String[] args) {
        System.out.println(C01_kullanici.kullaniciAdi);
        C01_kullanici.yazilim3();



    }
    public static void yazilim3(){
        System.out.println("04 package'indaki yazilim3 methodu calisti");
    }
}