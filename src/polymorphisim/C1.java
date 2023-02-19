package polymorphisim;

public class C1 extends OverRiding1{
    public static void main(String[] args) {

        OverRiding1 obj=new OverRiding1(); //class OverRiding1 uzerinden obje olustugundan o classtaki metot calisir
        obj.yazdir();
        OverRiding1 obj1=new C1(); // bu class taki metot calisti.
       obj1.yazdir();
    }

    void yazdir(){
        System.out.println("C1 class taki metot calisti");
    }
}
