package if_statement;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        /*Asagidaki secenekler doğrultusunda gereken kodu yaziniz.
a) Son basamak 5 ‘e esit ve 5 den büyükse, yuvarlama islemi: “Son basamağı bir üst ondalıiga yuvarla”
b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int giris= input.nextInt();
        if(giris%10>=5){
            System.out.println("Son basamağı bir üst ondalığa yuvarla :"+ ((giris/10)+1)*10);
        }else{
            giris= (giris/10)*10;
            System.out.println("Son basamağı bir alt ondalığa yuvarla :" +(giris/10)*10);
        }
    }
}
