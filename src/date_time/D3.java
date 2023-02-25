package date_time;

import java.time.LocalDate;

public class D3 {
    public static void main(String[] args) {


        LocalDate date=LocalDate.of(2012,1,30);
      date.plusDays(10);
        System.out.println(date); //2012-01-09. date= date.plusDays(10); yapilmadigindan sonuc degismez.
    }}
