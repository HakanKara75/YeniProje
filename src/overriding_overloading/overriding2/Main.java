package overriding_overloading.overriding2;

public class Main {
    public static void main(String aga[]){
        Shape c = new Circle();
        c.draw();
        c.paint();

        Shape s = new Square();
        s.draw();
        s.paint();

        Shape t = new Shape();
        t.draw();
        t.paint();
    }
}
