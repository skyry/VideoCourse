package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Toster");
        map.put(778, "TV");
        map.put(779, "TV box");
        map.put(780, "Lamp");

        System.out.println("map = " + map);

    }
}
