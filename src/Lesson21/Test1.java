package Lesson21;

public class Test1 {
    public static void main(String[] args) {
//        int a = 4;
//        System.out.println((a<4)?7:"Hi");

        int a = 5;
        int b = 5;
        int c = (a > 5) ? a++ : b++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
