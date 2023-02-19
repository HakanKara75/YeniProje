package statics;
/*
        A) Static variable'lara sadece classin ismi kullanılarak da ulaşılabilir.
        B) Static olmayan variable'lara ulaşabilmek için object oluşturmak zorundayız.
        C) Static variable'larin diğer adi class variable'dir. Instance variable'larin diğer adi object
        variable'dir.
        D) Static variable'lar object'lerin ortak kullanımına açıktır fakat instance variable'lar değildir.
        */


public class S1 {
    static int as = 10;
int nonsttc=3;
    public static void main(String[] args) {
        S1 t1 = new S1();
        S1 t2 = new S1();

        t1.as = as + 2;
        t2.as = as + 3;
        System.out.println(t1.as);
        System.out.println(t2.as);
    }
}