package map;

import java.util.*;

public class M6 {
    public static void main(String[] args) {


    /*        Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?*/
    List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
    Map<Integer, Integer> myMap = new HashMap<>();

        for(
    Integer w :myList)

    {
        Integer a = myMap.get(w);
        if (a == null)
            myMap.put(w, 1);
        else
            myMap.put(w, a + 1);

    }


    Collection<Integer> count = myMap.values();
    int counter = 0;
        for(
    Integer w:count)
            if(w>1)
    counter++;
        System.out.println(myMap);
        System.out.println("Tekrarlanan oge sayisi "+counter+" adettir.");
}
}
