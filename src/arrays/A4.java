package arrays;

public class A4 {
    public static void main(String[] args) {
/*  String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
alınız.
Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM  */
String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
String initials = "";
for(String w : b){
if(w.endsWith("n") || w.endsWith("k")){
 initials = initials + w.substring(0,1);
}
}
System.out.println(initials);


    }
}
