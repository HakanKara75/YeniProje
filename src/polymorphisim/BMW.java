package polymorphisim;

public class BMW extends C{

    @Override
    void marka() {

        System.out.println("Markamiz BMW");
    }

    @Override
    void yakit() {
        super.yakit();
        System.out.println("Benzinli");
    }
}
