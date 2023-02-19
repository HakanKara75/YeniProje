package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class A2 {
    public static void main(String[] args) {
        /*
        Ali'nin kaç ay yaşadığını bulan kodu yazınız.
Ali'nin doğum tarihi 4 Haziran 1997'dir.
         */
        LocalDate dt=LocalDate.of(1997,4,06);
        LocalDate now= LocalDate.now();

        long ayFarki= ChronoUnit.MONTHS.between(dt, now);
        System.out.println("Ali'nin yasadigi ay sayisi: "+ayFarki);

    }
}
