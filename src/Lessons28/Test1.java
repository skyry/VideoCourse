package Lessons28;
import java.time.*;
public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
        LocalDate ld1 = LocalDate.of(2023,03,25);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2023,Month.MARCH,25);
        System.out.println(ld2);
        LocalTime lt1 = LocalTime.of(23,54);
        System.out.println(lt1);

    }


}
