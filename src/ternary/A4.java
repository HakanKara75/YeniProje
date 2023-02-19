package ternary;

public class A4 {
    public static void main(String[] args) {
  /*      Nested Ternary kullanarak Apex kodunu yazınız.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
                Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
                Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir. */
        int y = 1800;
        String artikYilMi = (y%100==0) ? ( (y%400==0) ? ("Artik Yil") : ("Artik Yil Degil") ) : ( (y%4==0 ? ("Artik" +
                "Yil ") : ("Artik Yil Degil ") ));
        System.out.println(artikYilMi);
    }
}
