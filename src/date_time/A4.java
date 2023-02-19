package date_time;

import java.time.LocalDate;

public class A4 {
    public static void main(String[] args) {
        /*
        Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
         */
        LocalDate cmhryt=LocalDate.of(1923, 10,29);
        LocalDate aliDt=cmhryt.plusYears(45).plusMonths(8).plusDays(5);
        System.out.println("Ali'nin dogum tarihi: "+aliDt);

        LocalDate iki=LocalDate.of(1993, 9, 15);
        LocalDate vlDt=iki.minusYears(24).minusMonths(2).minusDays(11);
        System.out.println("Veli'nin dogum tarihi: "+vlDt);
    }
}
