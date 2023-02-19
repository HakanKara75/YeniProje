package loop_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L4 {
    public static void main(String[] args) {
        int a[] = { 0, 2, 5, 3, 1 };

        List<Integer> list=new ArrayList<>();
        Arrays.stream(a).forEach(t-> list.add(t));
        int max=list.stream().reduce(Integer.MIN_VALUE, Integer::max); //5
        int idxOfMax=list.indexOf(max);

        List<Integer> part1=new ArrayList<>();
        list.stream().filter(t-> list.indexOf(t)<=idxOfMax).forEach(t-> part1.add(t));


        List<Integer> sortedPart1 = new ArrayList<>();
        part1.stream().forEach(t -> sortedPart1.add(t));
        Collections.sort(sortedPart1);
        List<Integer> part2 = new ArrayList<>();
        list.stream().filter(t -> list.indexOf(t) >= idxOfMax).forEach(t -> part2.add(t));
        List<Integer> reverseSortedPart2 = new ArrayList<>();
        part2.stream().forEach(t -> reverseSortedPart2.add(t));
        Collections.sort(reverseSortedPart2);
        Collections.reverse(reverseSortedPart2);
        if (part1.equals(sortedPart1) && part2.equals(reverseSortedPart2)) {
            System.out.println(list + " Mountain Arraydir");
        } else {
            System.out.println(list + " Mountain Array degildir");

        }
    }
}
