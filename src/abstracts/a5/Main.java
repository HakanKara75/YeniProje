package abstracts.a5;

public class Main {
    public static void main(String[] args) {
CustomerManager customerManager=new CustomerManager();
customerManager.databaseManager=new OracleDatabaseManager();
customerManager.getCustomers();
//        customerManager.databaseManager=new MySqlDatabaseManager();
//        customerManager.databaseManager=new SqlDatabaseManager();


    }
}
