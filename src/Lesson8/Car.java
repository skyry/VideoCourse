package Lesson8;

public class Car {
    String color = "Blue";
    String engine = "V6";
}


class Human {
    String name = "Vicor";
    Car c = new Car();

    public static void main(String args[]) {
        Human h1 = new Human();
        Car c1 = new Car();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.engine = "V8";
        System.out.println(c1.engine);
        System.out.println(h1.c.engine);
    }
}
