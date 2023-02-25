package for_each_loop;

public class F3 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
        for (int[] w : arr) {
            for (int z : w) {
                System.out.print(z + " ");
            }
        }
    }

}
