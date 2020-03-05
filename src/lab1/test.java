package lab1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("当前日期=" + date);
        LocalDate date2 = LocalDate.now();
        LocalDate newDate = date.plus(1, ChronoUnit.WEEKS);
        System.out.println("newDate=" + newDate);
    }
}
