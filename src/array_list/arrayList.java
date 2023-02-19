package array_list;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println(myList);
        myList.add(1,15);
        System.out.println(myList);

    }
}
