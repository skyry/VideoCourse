package Lessons26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("black", "v8");
        Car c2 = new Car("red", "v6");
        Car c3 = new Car("black", "v8");
        Test1 v = new Test1();
        ArrayList<Object> array = new ArrayList<>();
        array.add(c1);
        array.add(c2);
        array.add(c3);

        System.out.println(c1.equals(c3));
        System.out.println(c1.toString());
        System.out.println(array);
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override   //Overaide метода equals для нашего Car
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car) obj;
            return (color.equals(c.color) && engine.equals(c.engine));
        } else return false;
    }

    @Override //Overaide метода toString для нашего Car
    public String toString() {
        return "Car color: " + color + " and engine: " + engine;
    }

}
