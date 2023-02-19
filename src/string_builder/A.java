package string_builder;

import java.util.*;

public class A {
    public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.add("X");
            list.add("Y");
            list.add("Z");
            ListIterator<String> it = list.listIterator();
            while(it.hasNext()) {
                Object el = it.next();
                it.remove();
            }
            System.out.println(list);

    }
}
