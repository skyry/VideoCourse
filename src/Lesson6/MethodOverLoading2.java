package Lesson6;

public class MethodOverLoading2 {
    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }
}


class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverLoading2 mo2 = new MethodOverLoading2();
        System.out.println(mo2.sum(2, 10));
        System.out.println(mo2.sum("Hello ", "Friend!"));
    }
}