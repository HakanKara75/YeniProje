package interfaces.i1.i1;

import interfaces.i1.i1.ICustomerDal;
import interfaces.i1.i1.IRepository;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("MwSql eklendi.");
    }
}
