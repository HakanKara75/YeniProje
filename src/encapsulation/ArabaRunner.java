package encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb=new Araba();
        // arb ovjesi uzerinden marka variable ina ulasabildik ve yazdirabildik.
        //access modifier i default oldugundan ulasabildik bilgilere
        arb.marka="fiat";
        System.out.println(arb.marka);

// model ve yakitin access modifier private yapinca goremiyoruz.
        //yakit turunu degistirilemez ama gorulsun emri verildi. onu private yaptik
        //modeli goremeyelim ama degistirebilelim emri verildi.

        arb.setModel("egea"); //modeli degistirebildik ama getter metodu olmadigindan yazdiramadik.

        System.out.println(arb.getYakit());  //yakit turunu gorebildik ama setter olmadigindan degistiremedik.


    }
}
