package Lessons9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color, String engine){
        count ++;
        this.color = color;
        this.engine = engine;
    }

    public void shoColor() {
        System.out.println("Color car: " + color);
    }

    public void changeColor(String color3){
        System.out.println("Color car change");
        int price = 5000;
        color = color3;
        price += 1000;
    }
}
