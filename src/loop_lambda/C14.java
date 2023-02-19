package loop_lambda;

public class C14 {
    public static void main(String[] args) {
        /*Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
1. Yol:*/
int rows = 4, columns = 8;
for(int i=1; i<=rows; i++){
String s = "";
if(i==1 || i==rows){
 for(Integer k=1; k<=columns; k++){
 s = s + "A ";
 }
 System.out.println(s);
}else{
 s = s + "A ";
 for(Integer m=2; m<columns; m++){
 s = s + "X ";
 }
 s = s + "A ";
 System.out.println(s);
    }
}
    //2. Yol:
        int rows1 = 4, columns1 = 8, k = 1;
        while(k<=rows){
            String s = "";
            if(k==1 || k==rows1){
                for(Integer m=1; m<=columns; m++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
            k++;
        }
        //3. Yol:
        int rows2 = 4, columns2 = 8, i = 1;
        do{
            String s = "";
            if(i==1 || i==rows2){
                for(Integer k2=1; k2<=columns2; k2++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
            i++;
        }while(i<=rows2);
    }
    }