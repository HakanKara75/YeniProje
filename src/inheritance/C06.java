package inheritance;

import java.util.ArrayList;
import java.util.List;

public class C06 extends C05{
    String str="gul";
    C06(int a){

        System.out.println("C06 daki cons calisti");

    }

    public C06(String str) {
        this(2);
        System.out.println("C06 daki parametreli cons calisti");
    }

    public static void main(String[] args) {
        C06 obj=new C06(2); //3 class da calisir
        C04 obj1=new C06("a");//3 class da calisir
obj1.ekleme();
        System.out.println(obj1.str); //lale olur. cunku obje C04 ten olustu.

        List<String> list=new ArrayList<>(); //ArrayList den variable olusturduk. List metotlarini kullanir bu variable.
    }

    @Override
    void ekleme() {
        super.ekleme();
    }
}
