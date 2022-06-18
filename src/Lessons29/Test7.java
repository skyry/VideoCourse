package Lessons29;

import java.util.ArrayList;

public class Test7 {
    // var p = 10; //not use out method
    public static void main(String[] args) {
        var tit = new TestInferenceType();
        var i = 10;
        var w = 1.5f;
        var array1 = new String[]{"a", "b", "c"};
        var result = abc();
        Object obj1 = "Hello";
        var obj2 = obj1;
        ArrayList<String> list = new ArrayList<>();
        for (var s : list) {
            System.out.println(s);
        }
        var array2 = new int[]{1, 2};
        var var = "var";
    }

    static double abc() {
        return 3.14;
    }

}

class TestInferenceType {

}

interface I{
    void abc();
    default void def(){}
    default void def2(){}
    static void def3(){}
}
