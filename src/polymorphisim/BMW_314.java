package polymorphisim;

public class BMW_314 extends BMW{

    @Override
    void model() {
        super.model();
        System.out.println("modelimiz BMW 314");
    }

    @Override
    void motorGucu() {
        System.out.println("motor gucu 2000");
    }
}
