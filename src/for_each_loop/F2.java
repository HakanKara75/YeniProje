package for_each_loop;

public class F2 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };
        for (int w : arr) {
            System.out.print(w + " ");
            if(w>4) {
                break;
            }
        }
    }

}
