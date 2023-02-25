package for_each_loop;

import java.util.ArrayList;
import java.util.List;

public class F4 {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6};
        List<Integer> list1 = new ArrayList<>();
        for(int w : arr) {
            list1.add(w);
        }
        System.out.println(list1.get(2));
    }

}
