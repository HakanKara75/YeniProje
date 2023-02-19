package date_time;

import java.sql.Date;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class A1 {
    public static void main(String[] args) {
        /*
        Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 12 Mayıs 2002'dir.
         */
        LocalDate dogumGunuTarihi = LocalDate.of(2002, 5, 12);
        LocalDate now=LocalDate.now();
        long kacGunYasadi= ChronoUnit.DAYS.between(dogumGunuTarihi ,now );
        System.out.println("Ali’ nin su ana kadar yasadigi gun sayisi : " +kacGunYasadi); //7580


    }
}
