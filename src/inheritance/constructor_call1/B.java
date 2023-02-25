package inheritance.constructor_call1;

public class B extends A{
    public B(){
        super(5);
        System.out.println("Class B Constructor");
    }
    public B(double d){
        System.out.println("Class B double Constructor");
    }
}