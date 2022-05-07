package Lesson16;

public class Test11 {

    public static void main(String[] args) {
        String s1 = "privet";
        System.out.println(s1.isBlank());
        String s2 = "    ";
        System.out.println(s2.isBlank());

        String s3 = "";
        System.out.println(s3.isEmpty());
        String s4 = "   ";
        System.out.println(s4.isEmpty());

        String s5 ="      Hello      ";
        System.out.println(s5.stripLeading());
        System.out.println(s5.stripTrailing());
    }
}
