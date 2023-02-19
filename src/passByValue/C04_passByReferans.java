package passByValue;
public class C04_passByReferans {
    public static void main(String[] args) {
  /*
Java eger methodda array ve listin kendisine yani yapisina dokunmaz ise o zaman
icindeki elemanlari degistirme hakki tanir.
ancak biz method icinde array ve listin yapisina dokunursak java orjinal yapimizi korur
 */
        int [] b={2,6};
        sayiyiDegistir(b);
        System.out.println(b[0]); // 5
    }
    public static void sayiyiDegistir(int[] a) {
        a[0]=5;
    }
}
