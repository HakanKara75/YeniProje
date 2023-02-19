package inheritance;

public class C01_IK {

    public int sayac=1000;
        protected String isim;
        protected String soyisim;
        protected String adres;
        protected int telefon;
        protected int id;

protected int idAtama(){
   this.id=sayac;
    sayac++;
    return id;

}

}
