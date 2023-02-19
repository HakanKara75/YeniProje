package loop_lambda;

public class C11_forLoop {
    /*
    5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
     */
    public static void main(String[] args) {
        for (int i = 3; i <=9 ; i++) {
            if (i==5){
                continue;
            }else System.out.println(i+" ");
        }
    }
}
