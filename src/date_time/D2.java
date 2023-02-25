package date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class D2 {
    public static void main(String[] args) {


    LocalTime time = LocalTime.now();
 //   Eğer saat 09:34:02.960 PM ise ciktilar nedir?
  System.out.println(time.plusMinutes(11));

  System.out.println(time.minusHours(2));

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
System.out.println(dtf.format(time));

DateTimeFormatter dtfo = DateTimeFormatter.ofPattern("HH:mm");
System.out.println(dtfo.format(time));


}
}