package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue {

    public static void main(String[] args) {
        //en bastan ekler, en sondan siler.
        Queue<String> list3=new LinkedList<>();
        list3.add("Ali");
        list3.add("Ayse");
        list3.add("Hakan");
        list3.add("Ahmet");
//sadece data ekler. indexe gore eklemez.

        list3.remove("Ayse");
//string siler.
        System.out.println(list3); //[Ali, Hakan, Ahmet]
list3.clear();//hepsini siler
        System.out.println(list3);
        list3.add("Hakan");
        list3.add("Ahmet");
        list3.add("Selim");
        list3.add("Hasan");
        System.out.print(list3.element()); // ilk degeri donderir. Hakan. bossa exception atar.

        System.out.println(list3.peek()); // ilk elemani donderir. bos ise null verir.

        System.out.println(list3.poll()); // bos ise null dondurur. ilk elemani verir.

        list3.offer("Hakan");// ekleme yapar
        list3.offer("Ayse");
        System.out.println(list3);

    }
}
