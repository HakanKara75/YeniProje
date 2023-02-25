package try_catch;

public class T7 {
    public static void main(String[] args){
        try {
            int a[]= {7, 8, 9};
            for (int i = 1; i <= 7; i++){
                System.out.println(a[i]);
            }
        } catch(Exception e) {
            System.out.println ("Exception");
        }finally {
            System.out.println("Done!");
        }
    }
}