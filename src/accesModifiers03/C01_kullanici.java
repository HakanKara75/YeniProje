package accesModifiers03;

public class C01_kullanici {
    public static String kullaniciAdi="AFK";//herkes gorebilir
    static String ePosta="afk@gmail.com";//kurucular ve yonetim ekibi gorebilir
    private static String sifre="As1.";
    protected static int kullaniciId=123456;

    public static void main(String[] args) {
        System.out.println(ePosta);
        //  System.out.println(kullaniciId);
        //  System.out.println(kullaniciAdi);
        System.out.println(sifre);


    }protected static void yazilim(){
        System.out.println("yazilim methodu calisti");

    }static void yazilim2(){
        System.out.println("yazilim2 methodu calisti");
    }public static void yazilim3(){
        System.out.println("yazilim3 methodu calisti");
    }

}