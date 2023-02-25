package inheritance.i1;

public class C extends A {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();

        b1=(A)b2;      //cons. A olan b1 e cons. C olan b2 ataniyor.
        A b3= b2;   //cons. A olan b3 e cons. C olan b2 ataniyor.
        b1.test(); //cons. C oldugu icin C class calisir
        b3.test();//cons. C oldugu icin C class calisir
    }
}