package HomeWork.Lessons11;

public class Car {
    String color;
    String engine;
    int door;

    Car(String color, String engine, int door){
        this.color = color;
        this.engine = engine;
        this.door = door;
    }
}

class CarTest{
    public static void chageDoor (Car c1, int a){
        c1.door = a;
    }

    public static void changeColor(Car c1, Car c2){
        String c = c2.color;
        c2.color = c1.color;
        c1.color = c;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Black", "V8", 5);
        Car c2 = new Car("Blue", "V6", 5);
        chageDoor(c1,3);
        changeColor(c1,c2);

        System.out.println("Car 1: Color " + c1.color + ", Engine " + c1.engine + ", Door "+ c1.door);
        System.out.println("Car 2: Color " + c2.color + ", Engine " + c2.engine + ", Door "+ c2.door);

    }
}
