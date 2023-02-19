package loop_lambda;

public class C15 {
    public static void main(String[] args) {
 /*       Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        kod yazınız.
        1. Yol: */
        String result = "";
        for(char i = 'C'; i>='A'; i--){
            result = result + i;
        }
        System.out.println(result);
     //   2. Yol:
        char ch = 'C';
        String result1 = "";
        while(ch>='A'){
            result1 = result1 + ch;
            ch--;
        }
        System.out.println(result1);
      //  3. Yol:
        char ch1 = 'C';
        String result2 = "";
        do{
            result2 = result2 + ch1;
            ch1--;
        }while(ch1>='A');
        System.out.println(result2);

    }
}
