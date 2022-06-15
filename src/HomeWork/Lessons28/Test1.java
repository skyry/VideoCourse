package HomeWork.Lessons28;

import HomeWork.Lessons9.Test;

import java.text.Format;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test1 {
    DateTimeFormatter df1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:ss");
    DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hh:ss, dd/MMM/YY");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p1, Duration d1) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Work with: " + ldt1.format(df1));
            ldt1 = ldt1.plus(p1);
            System.out.println("Before: " + ldt1.format(df1));
            System.out.println("Rest with: " + ldt1.format(df2));
            ldt1 = ldt1.plus(d1);
            System.out.println("Before: " + ldt1.format(df2));
        }

    }

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.of(2021, 01, 01, 00, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2022, 01, 01, 23, 40);
        Period p1 = Period.ofMonths(1);
        Duration d1 = Duration.ofDays(10);

        Test1 t = new Test1();
        t.smena(ldt1, ldt2, p1, d1);

    }
}
