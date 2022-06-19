package Lessons31;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Info<String> i1 = new Info<>("Super");
        System.out.println(i1);
        String s = i1.getValue();

        Info<Integer> i2 = new Info<>(125);
        System.out.println(i2);
        Integer i = i2.getValue();
    }

}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{ " + value + " }]";
    }

    public T getValue() {
        return value;
    }
}
