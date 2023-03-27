package passByValue;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
      /*
      4 elemanli bir array olusturalim
      bu array'in 2. ve 4. elemanlarini
      100'den kucuk rastgele bir sayi ile degistirelim
      sonra ayri bir method'da ve yeni halini yazdiralim
       */
        int arr[]={3,5,7,9};
        arrayDegistir01(arr);
        System.out.println("arraydegistir methodundan sonra : "+Arrays.toString(arr)); //[3, 5, 7, 9]
        //arrayDegistir01 metodu kendi skop'u icinde 3 elemanli arr olusturdugunda orada gecerlidir.main etkilenmez.
        elemanDegistir(arr);
        System.out.println("main method icinde : "+Arrays.toString(arr)); //[3, 42, 7, 5]


    }

    public static void arrayDegistir01(int[] arr) {
        /*
verilen 4 elemanli bir array'i method'a gonderelim method'da yeni 3 elemanli
bir array atayip bu yeni array'e rastgele
100'den kucuk 3 sayi atayalim method da arrray'i yazdiralim
main method'da da method call'dan sonra yeniden method'u yazdiralim

 */
        arr=new int[3];
        Random rnd=new Random();
arr[0]= rnd.nextInt(100);
arr[1]= rnd.nextInt(100);
arr[2]= rnd.nextInt(100);
        System.out.println("arrayDegistir01 method icinde: "+Arrays.toString(arr)); //[82, 67, 19]
/*skop icinde yeni bir 3 elemanli arr olusturuluyor. bu skop icinde gecerlidir.*/
    }

    public static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("elemanDegistir method icinde : "+Arrays.toString(arr)); //[3, 42, 7, 5]
/*
sadece 2 eleman degistigi icin arr=rnd olmadigindan java bunu kabul eder. mainde de gecerli.
 */
    }






}
