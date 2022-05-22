package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("hello");

        for (String i:list) {

            System.out.print(i+ " ");

        }
        System.out.println();
        System.out.println(list.indexOf("privet"));

        System.out.println(list.toString());
    }
}
