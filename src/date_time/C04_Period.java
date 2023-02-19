package date_time;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;
// kullanicidan tarih girmesini isteyin. girilen tarih ile bugunku tarihi karsilastirin
    public class C04_Period {
        public static void main(String[] args) {
            LocalDate bugun=LocalDate.now();
            Scanner scan=new Scanner(System.in);
            System.out.println("lutfen yil giriniz");
            int yil= scan.nextInt();
            System.out.println("lutfen ay giriniz");
            int ay= scan.nextInt();
            System.out.println("lutfen gun giriniz");
            int gun=scan.nextInt();
            LocalDate tarih=LocalDate.of(yil,ay,gun);

            Period period=Period.between(bugun,tarih);
            System.out.println("iki tarih arasindaki fark: "+period); // P27Y10M7D
        }
    }
