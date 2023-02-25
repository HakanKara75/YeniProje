package overriding_overloading.overriding4;

public class O2 extends O1 {

    int x = 12;
    public void go() {
        System.out.println("Bad");
    }
    public static void main(String args[]) {
        O1 obj = new O2();
        obj.go();
        System.out.println(obj.x);



    }
}