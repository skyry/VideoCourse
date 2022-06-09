package Lessons27;

public class Test5 {
    static void abc() {
        System.out.println("Work method abc");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println("Catch exception: " + e);
        }

    }

}
