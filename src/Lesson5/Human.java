package Lesson5;

public class Human {

    String name;
    Car3 car;
    BankAccount ba;

    void info() {
        System.out.println("Name: " + name + " Color car: " + car.color + " Bank Account: " + ba.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Jack";
        h.car = new Car3("Black", "V8");
        h.ba = new BankAccount(458, 20000);
        h.info();
    }
}

class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;
}