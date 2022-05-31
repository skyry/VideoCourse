package HomeWork.Lessons24;

public class Test1 {
}

abstract class Animal {
    public Animal(String name) {
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    String nameFish;
    public Fish(String nameFish, String name) {
        super(name);
        this.nameFish = nameFish;
    }

        super();
    }

    void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    String nameBird;

    public Bird(String nameBird, String name) {
        super(name);
        this.nameBird = nameBird;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(nameBird + " sings");
        ;
    }
}

abstract class Mammal extends Animal implements Speakable {
    String nameMammal;
    public Mammal(String nameMammal, String name) {
        super(name);
        this.nameMammal = nameMammal;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {
    String nameMechenosec;
    public Mechenosec(String nameMechenosec, String nameFish) {
        super(nameFish);
        this.nameMechenosec = nameMechenosec;
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec ne hishnaya riba, i ona est obichniy ribiy korm!");
    }

}

class Pingvin extends Bird {
    String namePingvin;
    public Pingvin(String namePingvin, String nameBird) {
        super(nameBird);
        this.namePingvin = namePingvin;
    }

}



