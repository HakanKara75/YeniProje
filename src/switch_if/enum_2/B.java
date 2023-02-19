package switch_if.enum_2;

public class B {
    public static void main(String[] args) {
        String browser=A.FALL.toString();
        switch(browser){
            case "WINTER":
                System.out.println("Snowboard yapmak");
                break;
            case "SUMMER":
            case "SPRING":
                System.out.println("Balik tutmak");
                break;
            case "FALL":
                System.out.println("Doga yuruyusu yapmak");
                break;
            default:
                System.out.println("Gecersiz data");
    }
}
}