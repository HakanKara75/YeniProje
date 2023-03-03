package inheritance.customer;

public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Employee employee=new Employee();

        customer.age=43;
        customer.firstName="Hakan";
        customer.lastName="Mert";
        customer.id=1;
        customer.email="hakanmert@gmail.com";

        employee.firstName= "Nihal";
        employee.lastName="Er";
        employee.age=43;
        employee.id=12;
        employee.salary=24567;

    }
}
