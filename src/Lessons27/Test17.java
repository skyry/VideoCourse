package Lessons27;

public class Test17 {
    void abc() {
        System.out.println("Method abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
            return;
        } finally {
            System.out.println("This is finally block");
        }
    }

    public static void main(String[] args) {
        Test17 t = new Test17();
        t.def();
    }
}
