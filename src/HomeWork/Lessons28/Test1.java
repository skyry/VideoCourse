package HomeWork.Lessons28;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2022, 06, 14, 23, 38);
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:ss");
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("hh:ss, dd/MMM/YY");
        System.out.println(ldt);
        System.out.println(ldt.format(df2));
    }
}
