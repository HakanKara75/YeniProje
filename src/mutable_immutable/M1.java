package mutable_immutable;

import java.util.ArrayList;
import java.util.List;

public class M1 {
    public static void main(String[] args) {
        //Immutable (değiştirilemez) variable larda atama yapilmazsa deger degismez.
        int n=3;
     //   n+8;
        System.out.println("sonuc: "+n); //sonuc: 3 cunku sonuc n=n+8; seklinde atama yapilmamis.
        n++;
        System.out.println("sonuc: "+n); //sonuc: 4 burada deger degisir cunku atama var.n=n+1;

        double dbl=12324.33;
       // dbl*2;
       // System.out.println("sonuc: "+dbl); sonuc: 12324.33
        //cunku dbl*2; islemi cte verir. dbl=dbl*2; olmadigi surece dbl'nin degeri degismez.

        // mutable (değiştirilebilir) variable da atama olmadan deger degisir.
        List<Integer> num= new ArrayList<>();
        num.add(23);
        num.add(34);
        num.add(3464);
        num.add(-6867);
        //add metotu ile variable degisir. ayrica atama yapmaya gerek yok.
        System.out.println(num); //[23, 34, 3464, -6867]
    }
}
