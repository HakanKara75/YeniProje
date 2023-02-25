package for_each_loop;

import java.util.ArrayList;
import java.util.List;

public class F6 {
    public static void main(String[] args) {


    List<Integer> list = new ArrayList<>();
list.add(21);
list.add(22);
list.add(23);
        int count = 0;
for(int w : list) {
        System.out.print(w + " ");
        count++;
        if(count==2) {
            break;
        }
    }
        System.out.println();
         count = 0;
        for(int w : list) {
            count++;
            if(count==2) {
                continue;
            }
            System.out.print(w + " ");
        }
        System.out.println();

         count=0;
        for(int w : list) {
            count++;
            if(count<3) {
                System.out.print(w + " ");
            }
        }
}
}