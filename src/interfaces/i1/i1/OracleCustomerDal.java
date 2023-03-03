package interfaces.i1.i1;

public class OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }
}
