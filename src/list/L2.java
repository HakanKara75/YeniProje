package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L2 {
    public static void main(String[] args) {


    /*       ) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür  */
    List<Integer> say = new ArrayList<>();
        say.add(12);
        say.add(11);
        say.add(15);
        say.add(34);
        say.add(43);
        say.add(13);
        say.add(21);
        Collections.sort(say);
    int minDiff=say.get(2)- say.get(1);
    int index1=-1;
    int index2=-1;
        for (int i = 1; i < say.size(); i++) {
        minDiff=Math.min (minDiff, say.get(i)-say.get(i-1));
    }
       for (Integer i=1; i<say.size(); i++){
        if ( say.get(i)-say.get(i-1)==minDiff)
            System.out.println("Farklari en az iki sayi : "+say.get(i)+ " "+ say.get(i-1));
    }

}
}