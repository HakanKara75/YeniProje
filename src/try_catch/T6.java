package try_catch;

public class T6 {
    public static void main(String[] args){

        try {
            int a[]= {7, 8, 9};
            for (int i = 1; i <= 3; i++){
                System.out.println(a[i]);
            }
        } catch(Exception e) {
            System.out.println ("Exception");
//    }catch(ArrayIndexOutOfBoundsException e) { // parent yukarida olunca bu gereksiz olur. yer degistirirse olur.
//        System.out.println ("Out of index");
        }finally {
            System.out.println("Done!");
        }
    }
}