package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class A1 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        list.add(12432);
        list.add("Hakan Kara");
        list.add('T');
        list.add(45.4343);

for (Object i:list){
    System.out.println(i);
}
       ArrayList<String > sehirler=new ArrayList<>();
sehirler.add("Ankara");
sehirler.add("Istanbul");
sehirler.add("Adana");
sehirler.add("Izmir");
        Collections.sort(sehirler);
        for (String sehir:sehirler){
            System.out.println(sehir);
        }

    }
}
