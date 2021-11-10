package Lesson6;

public class MethodOverLoading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);
    }
}


class MethodOverLoadTest {
    public static void main(String[] args) {
        MethodOverLoading mo = new MethodOverLoading();
        mo.show(500);
        mo.show(true);
        mo.show("Hi");

    }
}
