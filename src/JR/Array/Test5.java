package JR.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("Hello - " + i);
        }
        System.out.println("Size ArrayList - " + list.size());
        for (String i : list) {
            System.out.println(i);

        }
    }
}
