package if_statement;

public class A2_Sifre {
    public static void main(String[] args) {
        String sifre = "a1b2c3d4";
        if(sifre.replaceAll("\\S", "").length()>0){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else if(sifre.replaceAll("\\s", "").length()>=8){
            System.out.println("Gecerli Sifre");
        }else{
            System.out.println("Gecersiz Sifre ");

        }

    }
}
