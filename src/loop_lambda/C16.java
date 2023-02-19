package loop_lambda;

import java.util.Arrays;

public class C16 {
    public static void main(String[] args) {
        /*Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
0. Yol: */
String s = "Christmas";
String []arr=s.split("");
byte num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("m")) {
                num += i+1;
            }
        }
        s=s.substring(0,num);
        System.out.println(s);


//1.yol

String result = "";
for(int i=0; i<s.length(); i++){
String c = s.substring(i,i+1);
if(c.equals("m")){
 break;
}
result = result + c;
}
System.out.println(result);


 //2. Yol:
String s1 = "Christmas";
String rslt = "";
int i=0;
while( i<s1.length()){
String c = s1.substring(i,i+1);
if(c.equals("m")){
 break;
}
rslt = rslt + c;;
i++;
}
System.out.println(rslt);
//3. Yol:
String s2 = "Christmas";
String result3 = "";
int i1=0;
do{
String c = s2.substring(i1,i1+1);
if(c.equals("m")){
 break;
}
result3 = result3 + c;;
i1++;
}while( i1<s2.length());
System.out.println(result3);

    }
}
