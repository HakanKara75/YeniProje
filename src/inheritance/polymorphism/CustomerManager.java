package inheritance.polymorphism;

public class CustomerManager {

    private BaseLoger logger;

    public  CustomerManager(BaseLoger logger){
        this.logger =logger;
    }
public void add(){
    System.out.println("Musteri eklendi");
this.logger.log("Log mesaji");
}

}
