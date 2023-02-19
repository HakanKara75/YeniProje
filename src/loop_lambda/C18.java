package loop_lambda;

public class C18 {
    public static void main(String[] args) {
/*Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
Örneğin; Hello ==> Heo
1. Yol: */
String s = "Hello";
for(int i=0; i<s.length();i++){
String c = s.substring(i,i+1);
if(s.indexOf(c) == s.lastIndexOf(c)){
 System.out.print(c);
}
}
// 2. Yol:
String s1 = "Hello";
int i = 0;
while(i<s1.length()){
String c = s1.substring(i,i+1);
if(s1.indexOf(c) == s1.lastIndexOf(c)){
 System.out.print(c);
}
i++;
}
// 3. Yol:
String s2 = "Hello";
int i2 = 0;
do{
String c = s2.substring(i2,i2+1);
if(s2.indexOf(c) == s2.lastIndexOf(c)){
 System.out.print(c);
}
i2++;
}while(i2<s2.length());

    }
}
