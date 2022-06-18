package Lessons29;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test8 {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "Bye", "How are you", "It`s ok");
        list.forEach(s -> System.out.println(s));

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            list2.add(i);
        }
       list2.removeIf(el -> el % 3 == 0);

        /*Predicate<Integer> p = el->el%3==0;
        list2.removeIf(p);*/

        System.out.println(list2);

    }
}
