package loop_lambda;

public class C17 {
    public static void main(String[] args) {
        /*Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
1. Yol: */
int n = 753;
int sumOfDigits = 0;
for(int i = n; i>0; i=i/10){
sumOfDigits = sumOfDigits + i%10;
}
System.out.println(sumOfDigits);
//2. Yol:

int num = 753;
int sumOfDigits1 = 0;
while(num>0){
sumOfDigits1 = sumOfDigits1 + num%10;
num = num/10;
}
System.out.println(sumOfDigits1);
// 3. Yol:
int num1 = 753;
int sumOfDigits2 = 0;
do{
sumOfDigits2 = sumOfDigits2 + num1%10;
num1 = num1/10;
}while(num1>0);
System.out.println(sumOfDigits2);

    }
}
