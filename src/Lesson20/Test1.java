package Lesson20;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car car = new Car();
        list.add(car);
        Student st = new Student();
        list.add(st);
        list.add(new StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList<String>();
        list2.add("poka");
        ArrayList<StringBuilder> list3 = new ArrayList<>();

    }
}


class Car { }
class Student { }

