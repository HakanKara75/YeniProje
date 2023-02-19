package accesModifiers04;


import accesModifiers03.C01_kullanici;
import accesModifiers03.C02_kullaniciRunner;

public class C01_KullaniciRunner extends C01_kullanici {
    public static void main(String[] args) {
        C01_kullanici k1=new C01_kullanici();
        System.out.println(k1.kullaniciAdi);
        System.out.println(kullaniciId);
        //System.out.println(ePosta);
        yazilim();
        C02_kullaniciRunner.yazilim3();


    }public void method(){
        System.out.println(kullaniciId);
    }

}