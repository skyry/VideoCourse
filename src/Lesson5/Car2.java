package Lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;


    int gas(int skorost) {
        speed+=skorost;
        return skorost;
    }

    int tormoz (int skorost){
        speed-=skorost;
        return speed;
    }

    void showInfo(){
        System.out.println("Color: " + color + " Motor: " + engine + " Speed: " + speed);
    }

}


class Car2Test{
    public static void main(String[] args) {
        Car2 ford = new Car2();

        ford.color = "black";
        ford.engine = "V8";
        ford.speed = 200;
        ford.gas(200);
        ford.showInfo();
        ford.tormoz(50);
        ford.showInfo();
    }
}