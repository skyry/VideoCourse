package Lessons28;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, Month.JUNE, 14);
        LocalTime lt = LocalTime.of(23,12);
        LocalDateTime ldt = LocalDateTime.of(2022, Month.JUNE, 16, 22, 45);

//        DateTimeFormatter d1 =  DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(d1));
//
//        DateTimeFormatter d2 =  DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(d2));
//
//        DateTimeFormatter d3 =  DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt);
//        System.out.println(ldt.format(d3));
//
//        DateTimeFormatter d4 =  DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(ld);
//        System.out.println(ldt.format(d4));

        //System.out.println(ldt.getDayOfWeek());

//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(ld);
//        System.out.println(ld.format(shortFormat));
//        System.out.println(ldt);
//        System.out.println(ldt.format(shortFormat));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM d, yyYy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
    }
}