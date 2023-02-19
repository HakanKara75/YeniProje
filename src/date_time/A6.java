package date_time;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class A6 {
    public static void main(String[] args) {
     /*   Eğer saat
        //i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
        //ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
        //iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
        //iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.*/
        LocalTime jp=LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime deutch=LocalTime.now(ZoneId.of("Europe/Berlin"));
        long fark=ChronoUnit.HOURS.between(jp,deutch);
        System.out.println(fark);




}}
