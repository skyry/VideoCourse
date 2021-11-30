package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcdefg");

        String s2 = s1.substring(3);
        System.out.println(s2);

        String s3 = s1.substring(3, 7);
        System.out.println(s3);

        String s4 = s1.substring(3, 11);
        System.out.println(s4);

        String s5 = s1.replace('b', 'B');
        System.out.println(s5);

        String s6 = s1.replace("abcdef", "ABCDEF");
        System.out.println(s6);


    }
}
