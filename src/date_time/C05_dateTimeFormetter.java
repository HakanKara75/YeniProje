package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/* tarih formatini degistirip. yeni hali ile cikti alin */
public class C05_dateTimeFormetter {
        public static void main(String[] args) {
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yyyy mm:hh a");
            LocalDateTime bugun=LocalDateTime.now();
            System.out.println(dtf.format(bugun)); // 05/Şub/2023 54:09 ÖÖ
        }
    }