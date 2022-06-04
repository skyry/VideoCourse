package Lessons26;

public class Test4 {
    static void abc(String s) {
        System.out.println("A");
    }

    static void abc(String... s) {
        System.out.println("B");
    }

    static void abc(Object s) {
        System.out.println("C");
    }

    static void abc(String s1, String s2) {
        System.out.println("D");
    }


    static void def(Long l) {
        System.out.println("A");
    }

    static void def(Long... l) {
        System.out.println("B");
    }

    static void def(long l) {
        System.out.println("C");
    }

    static void def(Object l) {
        System.out.println("D");
    }

    static void def(Integer l) {
        System.out.println("E");
    }


    public static void main(String[] args) {
        Test4 t = new Test4();
        abc("Hello");
        def(55);
    }
}
