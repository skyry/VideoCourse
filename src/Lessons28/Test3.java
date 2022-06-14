package Lessons28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022,06,14);
        LocalDate ld2 = LocalDate.of(2021,Month.JULY,10);
//        System.out.println(ld1.isAfter(ld2));
//        System.out.println(ld1.isBefore(ld2));

        LocalTime lt1 = LocalTime.of(21,37);
        LocalTime lt2 = LocalTime.of(20,40,45,5556);
//        System.out.println(lt1.isAfter(lt2));
//        System.out.println(lt1.isBefore(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2022, Month.JUNE,14,21,38);
        LocalDateTime ldt2 = LocalDateTime.of(2022, Month.JUNE,14,21,38,25);
        System.out.println(ldt1.isAfter(ldt2));
        System.out.println(ldt1.isBefore(ldt2));

    }
}
