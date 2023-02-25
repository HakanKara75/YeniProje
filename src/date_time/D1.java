package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class D1 {
    public static void main(String[] args) {


    LocalDate date = LocalDate.now();
//  tarih 29 Haziran 2020 ise ciktilar nedir?
   System.out.println(date);

    System.out.println(date.plusMonths(2));

   System.out.println(date.minusDays(5));

 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
System.out.println(dtf.format(date));

}
}