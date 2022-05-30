package Lessons24;

public class Test3 {
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Teacher extends Employee implements Help_able {
    String lplichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Driver okazivaet pomosh");
    }

    @Override
    public void tushitPojar() {
        System.out.println("Driver tushit pojar");
    }

    @Override
    public void swim() {
        System.out.println("Driver plavaet");

    }
}

interface Help_able {
    void pomosh();

    void tushitPojar();
}

interface Swim_able {
    void swim();
}