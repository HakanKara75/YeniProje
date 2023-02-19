package encapsulation;

public class TasitRunner {
    public static void main(String[] args) {
        Tasit tasit=new Tasit();
        tasit.setTasitTuru("Kamyon");
        System.out.println(tasit.getTasitTuru());
    }
}
