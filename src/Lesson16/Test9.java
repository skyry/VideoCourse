package Lesson16;

public class Test9 {
    public static void main(String[] args) {

        String s1 = new String("OK");
        String s2 = new String("OK");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println();

        String s3 = new String("Privet");
        String s4 = new String("privet");
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
    }
}
