package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Poka");
        list.add("Privet");
        list.add("Ok");
        list.add(1, "Hello");
        for (String i : list) {
            System.out.print(i + " ");
        }
        /*
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        list.set(1,"Set");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        */
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Lst1");
        list2.add("Lst2");

        //list.addAll(list2);
        list.addAll(1,list2);

        System.out.println();
        for (String i : list) {
            System.out.print(i + " ");
        }

    }
}
