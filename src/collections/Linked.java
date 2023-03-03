package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Linked {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        LinkedList <String> lkis= new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3=new LinkedList<>();
        list.add("Ali");
        list.add("Ayse");
        list.add("Hakan");
        list.add("Ahmet");
        list.add(1, "Furkan");
        System.out.println(list);//[Ali, Furkan, Ayse, Hakan, Ahmet]

        list.remove("Ahmet");
        list.remove(1);//eger listimiz int olsaydi, indexe gore silmek icin bir variable atayip sileriz.
        //aksi halde girilen sayiyi index kabul edip, indexi silmeye calisir.

        List<String> deneme=new LinkedList<>();
        deneme.add("Mehmet");
        deneme.add("Selim");
        deneme.add("Hakan");
        deneme.add("Yesim");
        System.out.println(deneme); //[Mehmet, Selim, Hakan, Yesim]
        System.out.println(list.retainAll(deneme)); //kesisen kume elemanini silmez, gerikalani siler. 1 tane silse true
        //olur. hic silemezse false doner.
        System.out.println(list);//[Hakan]
        System.out.println(deneme);//[Mehmet, Selim, Hakan, Yesim]


    }
}
