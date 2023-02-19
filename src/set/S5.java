package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S5 {/*Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız. */

    public static void main(String[] args) {


    List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(31);
        myList.add(31);
        myList.add(15);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        myList.add(13);
        myList.add(13);
    Set<Integer> mist = new HashSet<>(myList);

        if (myList.size()!=mist.size())
                System.out.println("Tekrarli eleman yok");
        System.out.println(mist);
}
}