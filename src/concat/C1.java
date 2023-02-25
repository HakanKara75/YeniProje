package concat;

public class C1 {
    public static void main(String[] args) {
        String ta="A ";
        ta=ta.concat("B ");//A B
        String tb="C ";
        ta=ta.concat(tb);//A B C
        ta.replace('C','D');// A B C olmasi lazim ama atama yapilmamis. ta degismez.
        ta=ta.concat(tb); //A B C C olur
        System.out.println(ta);
    }
}

