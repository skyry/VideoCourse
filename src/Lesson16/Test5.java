package Lesson16;

import java.util.Locale;

public class Test5 {
    public static void main(String[] args) {
        String s = null;
        s += "ok";
        System.out.println(s);

        String s1 = "PRIVET";
        System.out.println(s1);

        String s2 = s1.toLowerCase();
        System.out.println(s2);

        String s3 = s1.toUpperCase();
        System.out.println(s3);

        boolean s4 = s1.contains("IV");
        System.out.println(s4);
    }
}
