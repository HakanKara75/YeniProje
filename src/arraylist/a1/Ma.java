package arraylist.a1;

import java.util.ArrayList;

public class Ma {
    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<Customer>();

        customers.add(new Customer(1, "Hakan", "Kara"));
        customers.add(new Customer(2, "Ali", "El"));
        customers.add(new Customer(3, "Veli", "Lal"));

        for (Customer customer:customers){
            System.out.println(customer.firstName+ " "+customer.lastName+ " "+customer.id);
        }


    }
}
