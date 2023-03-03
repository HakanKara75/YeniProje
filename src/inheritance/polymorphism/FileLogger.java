package inheritance.polymorphism;

public class FileLogger extends BaseLoger{
    public void log(String message){
        System.out.println("Logged to file"+ message);
    }

}
