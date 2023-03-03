package inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {
//        EmailLogger logger=new EmailLogger();
//        logger.Log("Log mesaji"); //Default logger
//
//        BaseLoger [] logers= new BaseLoger[]{new FileLogger(), new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//for (BaseLoger loger: logers){
//    loger.Log("Log mesaji");
//}

CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
customerManager.add();

    }
}
