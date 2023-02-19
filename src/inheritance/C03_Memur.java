package inheritance;

public class C03_Memur extends C02_Muhasebe {



    public static void main(String[] args) {

        C03_Memur memur=new C03_Memur();
        memur.isim="Mehmet";
        memur.soyisim="Aslan";
        memur.adres="Istanbul";
        memur.telefon=123455;
        memur.calismaSaati=8;
        memur.calistigiGun=20;
        memur.mesaiSaati=3;
        memur.idAtama();
        System.out.println(memur.maasHesapla());
        System.out.println(memur.mesaiHesapla());
        System.out.println("Toplam maas: "+memur.maasHesapla()+memur.mesaiHesapla());
        System.out.println(memur.id);

        C03_Memur memur1=new C03_Memur();
        memur1.isim="Mehmet";
        memur1.soyisim="Aslan";
        memur1.adres="Istanbul";
        memur1.telefon=123455;
        memur1.calismaSaati=8;
        memur1.calistigiGun=20;
        memur1.mesaiSaati=3;
        memur1.idAtama();
        System.out.println(memur1.maasHesapla());
        System.out.println(memur1.mesaiHesapla());
        System.out.println("Toplam maas: "+memur1.maasHesapla()+memur1.mesaiHesapla());
        System.out.println(memur.id);


    }
    protected int maasHesapla(){
        saatUcreti=12;
        maas=saatUcreti*calismaSaati*calistigiGun;
        return maas;
    }

    protected int mesaiHesapla(){
        maas=saatUcreti*mesaiSaati;
        return maas;
    }
}
