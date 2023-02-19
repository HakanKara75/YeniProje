package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        Apartman da01=new Apartman("dogu", 1, 7000);
        Apartman da02=new Apartman("bati", 2, 10000);
        Apartman da03=new Apartman("guney", 3, 12000);
        Apartman da04=new Apartman("Dogu", 5, 15000);

        List<Apartman> daireler= new ArrayList<>(Arrays.asList(da01, da02,da03,da04));

        System.out.println(tumDaireKira5000denBuyukIseTrue(daireler));
        System.out.println("******************************************************************");
        System.out.println(enAzBirininKatSayisi2IseTrue(daireler));
        System.out.println("******************************************************************");
        System.out.println(cephesiDoguOlanlarinSayisi(daireler));
        System.out.println("******************************************************************");
        System.out.println(katSayisinaGoreBuyuktenKucugeSirala(daireler));
        System.out.println("******************************************************************");
        System.out.println(katSayisiIkıdenFazlaOlanlariKirayaGoreSiralaEnBuyukKirayiYazdir(daireler));
        System.out.println("******************************************************************");
        katSayisiIkıdenFazlaOlanlariKirayaGoreSiralaEnBuyukKirayiYazdir2(daireler);
        System.out.println("******************************************************************");
        System.out.println(katSayisiUcdenAzOlanlariKirayaGoreKuctenBuySrlEnKucukKirayiYazdir(daireler));
        System.out.println("******************************************************************");

    }//main
// SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın

public static boolean tumDaireKira5000denBuyukIseTrue(List<Apartman> daireler){
    boolean sonuc = daireler.
            stream().
            allMatch(t-> t.getKira()> 5000); //hepsi eslesiyorsa true dondur
    return sonuc;
}

// SORU2: Dairelerden En Az Birinin kat Sayisi 2 ise return ederek True yazdırın

    public static boolean enAzBirininKatSayisi2IseTrue(List<Apartman> daireler){

boolean ikiMi=daireler.stream().anyMatch(t-> t.getKatSayi()==2); //anyMatch herhangi biri sarti saglarsa true dondurur
        return ikiMi;
    }
    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.
    public static int cephesiDoguOlanlarinSayisi (List<Apartman> daireler){
       int sonuc= (int) daireler.
                stream().
                filter(t -> t.getCephe().contains("Dogu")).
                count();

        return sonuc;
    }
//SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız. List halinde return ederek yazdırınız.
   public static List katSayisinaGoreBuyuktenKucugeSirala (List<Apartman> daireler){

        List <Apartman> sonuc= daireler.
                stream().
                sorted(Comparator.comparing(Apartman::getKatSayi).// comparator kiyaslama yapiyor.
                        reversed()).
                collect(Collectors.toList());// sonucu liste assign etmeye yariyor
        return sonuc;
    }
//SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
public static List<Integer> katSayisiIkıdenFazlaOlanlariKirayaGoreSiralaEnBuyukKirayiYazdir (List<Apartman> daireler) {

    List<Integer> sonuc = daireler.stream().
            filter(t -> t.getKatSayi() > 2).
            sorted(Comparator.comparing(Apartman::getKira).
                    reversed()).
            limit(1). // en buyugunu almak icin 1 yazdik
                    map(t -> t.getKira()).    // 3 veriden sadece kira ile urasacagimiz icin map sectik
                    collect(Collectors.toList());
return sonuc;
}

    public static void katSayisiIkıdenFazlaOlanlariKirayaGoreSiralaEnBuyukKirayiYazdir2 (List<Apartman> daireler) {

        Stream<Integer> sonuc = daireler.stream().
                filter(t -> t.getKatSayi() > 2).
                sorted(Comparator.comparing(Apartman::getKira).
                        reversed()).
                limit(1). // en buyugunu almak icin 1 yazdik
                        map(t -> t.getKira());    // 3 veriden sadece kira ile urasacagimiz icin map sectik

        System.out.println(Arrays.asList(sonuc.toArray()));
    }

//SORU6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
// en kucuk kira'sini list halinde return ederek yazdırınız.

    public static List<Integer> katSayisiUcdenAzOlanlariKirayaGoreKuctenBuySrlEnKucukKirayiYazdir (List<Apartman> daireler) {

        List<Integer> kira= daireler.
                stream().
                filter(t -> t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).
                map(t->t.getKira()). //3 veriden sadece kira ile ilgileniyorum
                collect(Collectors.toList());
        return kira;
    }

}//class
