package inheritance;

public class C02_Muhasebe extends C01_IK{

    protected int saatUcreti;
    protected int calismaSaati;
    protected int mesaiSaati;
    protected int maas;
    protected int calistigiGun;

    protected int maasHesapla(){
        maas=saatUcreti*calismaSaati*calistigiGun;
        return maas;
    }

    protected int mesaiHesapla(){
        maas=saatUcreti*mesaiSaati;
        return maas;
    }

    public void insanDondur(){
        System.out.println(isim);
        System.out.println(soyisim);
        System.out.println(adres);
        System.out.println(telefon);
        System.out.println(id);

    }

}
