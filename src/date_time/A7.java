package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class A7 {
    public static void main(String[] args) {
        /*Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
nedir?*/
        LocalDateTime dogumTrhAli = LocalDateTime.of(2015, 2, 5, 10, 0, 0);
        ZonedDateTime yerelDogumTrhAli = dogumTrhAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dogumTrhVeli = LocalDateTime.of(2015, 2, 5, 12, 0, 0);
        ZonedDateTime yerelDogumTrhVeli = dogumTrhVeli.atZone(ZoneId.of("America/New_York"));
        long saatFarki = ChronoUnit.HOURS.between(yerelDogumTrhAli, yerelDogumTrhVeli);
        System.out.println("Saatler arasi fark : " + saatFarki);


    }
}
