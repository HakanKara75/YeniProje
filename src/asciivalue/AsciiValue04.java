package asciivalue;

public class AsciiValue04 {
    public static void main(String[] args) {
         /*	Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
toplamını bulunuz.

*/
        String isim = "Ali Can";
        isim= isim.trim();

        int ilk = isim.charAt(0);
        int sonKrkIndex = isim.length()-1;
        int sonKrkAscii = isim.charAt(sonKrkIndex);


        System.out.println("ilk ve son karakterlerin ASCII degerlerinin toplami: " +(ilk+sonKrkAscii)); //175

    }
}
