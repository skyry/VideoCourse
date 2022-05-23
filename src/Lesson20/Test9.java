package Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
//        System.out.println(list1);

        /*ArrayList<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("three");
        list2.add("four");

        //list1.removeAll(list2);
        //list1.retainAll(list2);
        boolean result =list1.containsAll(list2);
        System.out.println(result);*//**//*

        List<String> sublist = list1.subList(1,4);
        System.out.println(sublist);*//*

        Object[] array = list1.toArray();
        String[] array2 = list1.toArray(new String[0]);
        for (String i : array2) {
            System.out.print(i + " ");
        }*/

//        List<String> lst =List.of("odin","dva","tri");
//        System.out.print(lst);
        List<String> lst2 = List.copyOf(list1);
        System.out.println(lst2);

    }
}
