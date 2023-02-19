package lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {

        System.out.println(birdenXeKadarToplam(10));
        System.out.println("****************************************************");
        System.out.println(birdenXDahilTekSayilariToplam(5));
        System.out.println("****************************************************");
        System.out.println(birdenSonsuzaKdrGidenTekSylIlkxTnsTopla(11));
        System.out.println("****************************************************");
        System.out.println(ikidenSonsuzaCiftSayIlkXTaneTopla());
        System.out.println("****************************************************");
        System.out.println(bastenSonsuzaKuvvetlerinIlkXKuvvetiTopla());
        System.out.println("****************************************************");
        faktoriyel();

    }//main
//SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
public static int birdenXeKadarToplam(int x){

  int sum= IntStream.range(1, x+1).// 2.deger haric oldugu icin +1 yaptik.
          sum();
  return sum;
}
//SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
    // tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)

    public static int birdenXDahilTekSayilariToplam(int x) {

        int sum = IntStream.
                rangeClosed(1, x).
                filter(t -> t % 2 != 0).
                reduce(0,Math::addExact); //sum da olabilirdi
        return sum;
    }

    //SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int birdenSonsuzaKdrGidenTekSylIlkxTnsTopla(int x) {

        int sum = IntStream.
              iterate(1, t->t+2). //1 den basla, 2 ser artir
                limit(x). // ilk x tanesini dedigi icin limit x
                sum();

        return sum;
    }

    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız

    public static int ikidenSonsuzaCiftSayIlkXTaneTopla() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen sayi girin");
        int x=sc.nextInt();
        int sum=IntStream.
                iterate(2, t->t+2). //2 den basla, 2 ser artir
                limit( x). // ilk x tanesini dedigi icin limit x
                sum();

        return sum;
    }

    //SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız

 public static int bastenSonsuzaKuvvetlerinIlkXKuvvetiTopla( ){
     Scanner sc=new Scanner(System.in);
     System.out.println("Lutfen sayi girin");
     int x=sc.nextInt();
     int sum=IntStream.
             iterate(5, t->t*5).
             limit(x).
             sum();
          return sum;
 }

 //SORU 6: x sayisinin faktoriyelini bulunuz.

    public static int faktoriyel(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini bulmak istediginiz sayiyi girin");
        int x=sc.nextInt();
       int sonuc= IntStream.
                rangeClosed(1,x).
                reduce(1,(a,b)->a*b);    //akistan gelen elemanlari tek bir elemana donusturur
        System.out.println(sonuc);
return sonuc;
    }
    }//class

