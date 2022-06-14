package Lessons28;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test4 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p){
        LocalDate date = nachalo;
        while (date.isBefore(konec)){
            System.out.println("The date has come "+date+". Time to change attendant");
            //date = date.plusMonths(1);
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2021, Month.SEPTEMBER,1);
        LocalDate konec = LocalDate.of(2022, Month.MAY,31);
        Period p = Period.ofWeeks(2);
        smenaDejurnogo(nachalo,konec,p);
    }
}
