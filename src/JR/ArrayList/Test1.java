package JR.ArrayList;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hi");
        list.add("goodbye");
        list.add("array");
        list.add("work");

        System.out.println("Size ArrayList: " + list.size());

        for (String i : list) {
            System.out.println(i);
        }
    }
}
