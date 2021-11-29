package Lesson16;

import HomeWork.Lessons10.p1.P2.P3.C;

public class Car {
    String color;
    String engie;

    Car(String color, String engie) {
        this.color = color;
        this.engie = engie;
    }

    final static int a = 5;


    public static void main(String[] args) {

    }

}


class CarTest {
    final static Car c = new Car("red","V8");
}
