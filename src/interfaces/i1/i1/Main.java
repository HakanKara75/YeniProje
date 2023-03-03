package interfaces.i1.i1;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());

      //  customerManager.customerDal=new MySqlCustomerDal();


        customerManager.add();

    }
}
