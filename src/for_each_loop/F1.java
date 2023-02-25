package for_each_loop;

public class F1 {
    public static void main(String[] args) {
    int arr[] = { 1, 3, 5, 7, 9 };
    for (int w : arr) {
        if(w<4) {
            continue;
        }
        System.out.print(w + " ");
    }
}
}
