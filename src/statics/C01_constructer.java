package statics;
public class C01_constructer {
    String isim;
    int yas=3;
    C01_constructer(String isim,int yas){
        this.isim=isim;
        this.yas=yas;

    }
    public C01_constructer(String isim) {
        this.isim=isim;
    }
    public static void main(String[] args) {
        C01_constructer obj1=new C01_constructer("Mehmet ali",21);
        System.out.println(obj1.isim+", "+obj1.yas); // Mehmet ali, 21
        C01_constructer obj2=new C01_constructer("ömer faruk");//sadece isim girildi
        System.out.println(obj2.isim+","+obj2.yas);//  ömer faruk,3// yasi non static variable dan aldi.
    }
}
