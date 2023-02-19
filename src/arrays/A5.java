package arrays;

public class A5 {
    public static void main(String[] args) {
/*  String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26    */
String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
int sum = 0;
for(String w : b){
sum = sum + w.length();
}
System.out.println("Total number of characters is " + sum);



    }
}
