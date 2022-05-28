package Lesson23;

public class A10 {
    String s1 = "Hello";
    static double d1 = 3.14;

    int summa(int... i) {
        int summ = 0;
        for (int s : i) {
            summ += s;
        }
        return summ;
    }

    static void abc (){
        System.out.println("Static method");
    }
}

class B10 extends A10{
    String s2 = super.s1+ ", friend!";


    public static void main(String[] args) {
        System.out.println(new B10().s2);
    }
}
