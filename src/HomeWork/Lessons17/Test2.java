package HomeWork.Lessons17;

public class Test2 {
    public static boolean ravenstvo1(StringBuilder sb1, StringBuilder sb2) {
        int c = 0;
        if (sb1.length() != sb2.length()) {
            return false;
        } else
            while (c < sb1.length()) {
                if (sb1.charAt(c) != sb2.charAt(c)) {
                    return false;
                } else c++;
            }
        return true;
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello World");
        StringBuilder sb2 = new StringBuilder("Hello World");
        StringBuilder sb3 = new StringBuilder("Hello world");
        StringBuilder sb4 = new StringBuilder("Hello");

        System.out.println(ravenstvo1(sb1, sb4));

    }
}
