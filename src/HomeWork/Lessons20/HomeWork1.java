package HomeWork.Lessons20;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork1 {

    public static ArrayList abc(String... st) {
        ArrayList<String> list = new ArrayList<>();

        for (String i : st) {
            if (list.contains(i)) {          //(list.indexOf(i) < 0)
                continue;
            } else list.add(i);
        }
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        System.out.println(abc("B", "B", "C", "D", "A", "A", "B", "B", "B"));

    }


}
