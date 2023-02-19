package ternary;

public class A1 {
    public static void main(String[] args) {
        /*Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola" */
        String parola="HakanKA";
        int aLngt=parola.length();
        String p=parola.replaceAll(" ", "");
        int bLngt=p.length();
        String gecerliMi= aLngt>7 && bLngt>7 ? "Gecerli": "Gecersiz";
        System.out.println(gecerliMi);
    }
}
