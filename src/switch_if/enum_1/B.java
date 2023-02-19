package switch_if.enum_1;

import switch_if.enum_1.A;

public class B {
    public static void main(String[] args) {
        String browser = A.IE.toString();
        switch(browser){
            case "CHROME":
                System.out.println("CHROME kullaniyorum");
                break;
            case "SAFARI":
                System.out.println("SAFARI kullaniyorum");
                break;
            case "IE":
                System.out.println("IE kullaniyorum");
                break;
            case "FIREFOX":
                System.out.println("FIREFOX kullaniyorum");
                break;
            case "YANDEX":
                System.out.println("YANDEX kullaniyorum");
                break;
            default:
                System.out.println("Gecersiz tarayici'");
    }
}
}