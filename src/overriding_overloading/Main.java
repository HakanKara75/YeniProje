package overriding_overloading;


public class Main {
    public static void main(String[] args) {
        Telefon telefon1=new Telefon("Iphone","14 pro","45000");
        System.out.println(telefon1.marka+","+telefon1.model+","+telefon1.fiyat); // Iphone,14 pro,45000
        Telefon telefon2=new Telefon("Samsung","S20");
        System.out.println(telefon2.marka+","+telefon2.model+","+telefon2.fiyat);// Samsung,S20,belirlenmedi
        Telefon telefon3=new Telefon("Casper");
        System.out.println(telefon3.marka+","+telefon3.model+","+telefon3.fiyat);// Casper,yok,belirlenmedi
        System.out.println(telefon1); //Telefon{marka='Iphone', model='14 pro', fiyat=45000}
        System.out.println(telefon3); //Telefon{marka='Casper', model='yok', fiyat=belirlenmedi}
        System.out.println(telefon2); //Telefon{marka='Samsung', model='S20', fiyat=belirlenmedi}
        Main main=new Main();


    }
}