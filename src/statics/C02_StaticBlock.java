package statics;
    public class C02_StaticBlock {

        static int sayi;

        static {
            System.out.println("main methoddan onceki static block calisti");
            sayi=7;
        }
        public static void main(String[] args) {
            System.out.println("main method calisti");
            System.out.println(sayi); // 6
/*** once ustteki static blok sayi yi 7 yapar. sonra en alttaki static blok calisir. sayi 6 olur. en son
 print calisir ve 6 olan sayiyi yazdirir.
 ***/
        }
        static {
            System.out.println("static block calisti");
            sayi=6;
        }
    /*
    classta birden fazla static block varsa yukardaki static block caliscak
    static blocklarin yeri farketmeksizin ilk basta calisirlar
    static block class uyelerinin tamimdan once calisir
    static variable'lara deger atamasi yapabiliriz
    classla ilgili on ayarlamalari yapabilir
     */
    }