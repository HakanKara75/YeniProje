package encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogr=new Ogretmen();
        ogr.setIsim("Pınar");
        System.out.println(ogr.getIsim());
    }
}
