package date_time;

import java.time.LocalDate;

public class A3 {
    public static void main(String[] args) {
        /* Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
        sonraki tam tarihi bulmak için kodu yazınız.
         */
        LocalDate dt=LocalDate.of(1997, 6, 4);
        LocalDate add=dt.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün \n" +
                "        sonraki tarihi: "+ add); //1999-09-16
    }
}
