package stringmanipulation;

public class A5 {
    public static void main(String[] args) {
        /*
        Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
         */
        String isim= "Hakan0)0?.]{%+ Kara";
        int ilk=isim.length();
        int iki= isim.replaceAll("[\\p{Punct}]", "").length();
        System.out.println("Metindeki toplam noktalama isareti sayisi: "+(ilk-iki)); //7
    }
}
