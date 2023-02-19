package statics;

public class deneme {
    static int y;
    static int x;
    deneme(int i){
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        new deneme(2); //ilk once bu satir degerleri 2 yapiyor.
        deneme dnm=new deneme(3); //sonra bu satir var olan 2 degerlerine deneme objesi ile 3 ekliyor.
        System.out.println(dnm.x+","+dnm.y); //5.5. obje uzerinden okuyunca

    }}