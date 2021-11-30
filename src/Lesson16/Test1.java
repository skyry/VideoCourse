package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcdefg");

        int i1 = s1.length();
        System.out.println(i1);

        char i2 = s1.charAt(2);
        System.out.println(i2);

        int i3 = s1.indexOf('t');
        System.out.println(i3);

        int i4 = s1.indexOf("t");
        System.out.println(i4);

        int i5 = s1.indexOf("vet");
        System.out.println(i5);

        int i6 = s2.indexOf("a", 1);
        System.out.println(i6);

        boolean i7 = s2.startsWith("abc");
        System.out.println(i7);

        boolean i8 = s2.startsWith("abc", 7);
        System.out.println(i8);

        boolean i9 = s2.endsWith("efg");
        System.out.println(i9);


    }
}
