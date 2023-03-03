package overriding_overloading.overriding5;

public class Main {
    public static void main(String[] args) {
        OgretmenKredi ogretmenKredi=new OgretmenKredi();
        System.out.println(ogretmenKredi.krediHesapla(10000));

        OgrenciKredi ogrenciKredi=new OgrenciKredi();
        System.out.println(ogretmenKredi.krediHesapla(10000));

        TarimKredi tarimKredi=new TarimKredi();
        System.out.println(tarimKredi.krediHesapla(10000));
    }
}
