package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("sorgulamak istediginiz yili giriniz");
        int yil=input.nextInt();
        String result= yil%100==0? (yil%400==0 ? "Leap Year": "Not Leap Year"): (yil%4==0 ? "Leap Year": "Not Leap Year");
        System.out.println(result);

        LocalDate tarih = LocalDate.of(1992, 8, 21);
        boolean artikYilMi = tarih.isLeapYear();
        System.out.println("tarihteki yil artik yildir " + artikYilMi);
    }
}
