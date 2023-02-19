package stringmanipulation;

public class A2 {
    public static void main(String[] args) {
        /*Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek
için kod yazınız.
         */
  String a= "Merhaba";
  boolean control=a.contains("e");
        System.out.println(control);

        if(a.length()==a.replaceAll("a", "").length()){
            System.out.println("Karakter yok");
        }else {
            System.out.println("Karakter var");
        }

boolean sonuc=a.indexOf("a")>0;
        System.out.println(sonuc);
    }
}
