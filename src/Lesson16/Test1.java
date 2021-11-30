package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcdefg");

        int i1 = s1.length();

        char i2 = s1.charAt(2);

        int i3 = s1.indexOf('t');

        int i4 = s1.indexOf("t");

        int i5 = s1.indexOf("vet");

        int i6 = s2.indexOf("a",1);



        System.out.println(i6);


    }
}
