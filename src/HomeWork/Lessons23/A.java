package HomeWork.Lessons23;

public class A {
    public A() {
        System.out.println("A");
    }

    public A(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        A a = new B(18);
        System.out.println(a.abc());
    }
}

class B extends A {
    public B(int i) {
        System.out.println("B");
    }

    public boolean abc() {
        return true;
    }
}
