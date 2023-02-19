package array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_arrayList {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
         */
        List<String> myList=new ArrayList<>();
        myList.add("mustafa");
        myList.add("zahide");
        myList.add("erel");
        myList.add("hakan");
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);








    }
}
