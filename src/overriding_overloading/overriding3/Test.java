package overriding_overloading.overriding3;

public class Test extends Test06 {
    @Override
    void go() {
        super.go();
    }

    public static void main(String args[]) {
        Test obj = new Test();
        obj.go();
    }
}
