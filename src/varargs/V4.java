package varargs;

public class V4 {
    public static void main(String[] args) {
     //   m3("Result: ", 2, 3, 4); //24
     //   m3("Result: ", 2, 2.5);

     //  m3("Result: ", 2); //2
      m3("Result: "); //1
        }
    public static void m3(String x, int... y) {
        int p = 1;
        for(int w: y) {
            p = p * w;
        }
        System.out.print("x: "+x);
        System.out.println("p: "+p);
}
}