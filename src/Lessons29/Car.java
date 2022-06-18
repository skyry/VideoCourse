package Lessons29;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is " + model + ", color is " + color + " and engine = " + engine;
    }
}

class Test {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "silver metalic", 1.6));
        System.out.println("Our cars: " + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Updated car: " + car);
        });

/*        Consumer<Car> consumer = car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Updated car: " + car);
        };
        changeCar(ourCars.get(0),consumer);*/
        System.out.println("Our cars: " + ourCars);

    }
}
