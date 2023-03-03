package inheritance.polymorphism;

public class DatabaseLogger extends BaseLoger{

    public void log(String message){
        System.out.println("Logged to databese"+ message);
    }
}
