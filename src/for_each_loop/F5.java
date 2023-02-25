package for_each_loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F5 {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6};
        List<Integer> list1 = new ArrayList<>();
        for(int w : arr) {
            list1.add(w);
        }
//2.yol
        int arr1[] = {3, 4, 5, 6};
        List<int[]> list = Arrays.asList(arr1);

    }


}
