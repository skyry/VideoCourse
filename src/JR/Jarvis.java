package JR;

import HomeWork.Lessons23.A;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Jarvis {
    ArrayList<String> list = new ArrayList<>();

    Jarvis(String... name) {
        for (String i : name) {
            list.add(i);
        }
    }

    public void sayHello(ArrayList lt) {
        lt.add("!!!");
        for (Object s : lt) {
            System.out.println("Hello " + s);
        }
    }

    public static void main(String[] args) {
        Jarvis j = new Jarvis("Serhii", "Petro", "Ivan", "Maksim");
        j.sayHello(j.list);
        System.out.println();

        for (Object s:j.list){
            System.out.println(s);
        }
    }
}
