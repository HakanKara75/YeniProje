package loop_lambda;

public class C13 {
    public static void main(String[] args) {
        /*Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238 ´ *4*2*3*8
1. Yol: */
double num = 75.4238;
String s = String.valueOf(num);
int idxOfComma = s.indexOf(".");
String decimalPart = s.substring(idxOfComma + 1);
String t = "";
for(Integer i=0; i<decimalPart.length(); i++){
String r = decimalPart.substring(i,i+1);
t = t + "*" + r;
}
System.out.println(t);
    //2. Yol:
double num1 = 75.4238;
String s1 = String.valueOf(num);
int idxOfComma1 = s.indexOf(".");
String decimalPart1 = s.substring(idxOfComma + 1);
String t1 = "";
Integer i=0;
while(i<decimalPart1.length()){
String r1 = decimalPart1.substring(i,i+1);
t1 = t1 + '*' + r1;
i++;
}
System.out.println(t);
    // 3. Yol:
double num2 = 75.4238;
String s2 = String.valueOf(num);
int idxOfComma2 = s.indexOf(".");
String decimalPart2 = s2.substring(idxOfComma2 + 1);
String t2 = "";
Integer k=0;
do{
String r2= decimalPart.substring(k,k+1);
t2 = t2 + '*' + r2;
i++;
}while(k<decimalPart.length());
System.out.println(t2);

    }
}
