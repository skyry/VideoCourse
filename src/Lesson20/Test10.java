package Lesson20;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        for (Object o : list) {
            System.out.println("Number = " + o + " and length = " + ((String) o).length());
        }
    }
}
