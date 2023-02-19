package statics;

public class S2 {
        int a = 10;
        public static void main(String[] args) {
            S2 t1 = new S2();
            S2 t2 = new S2();
            S1.as=5;
            S1 iki=new S1();

            t1.a = 12;
            t2.a = 13;
            System.out.println(t1.a);
            System.out.println(t2.a);
            System.out.println(S1.as); //static variable Class ismiyle ulasiriz.
            System.out.println(iki.nonsttc); //nonstatic variable obje ile ulasiriz.
}
}