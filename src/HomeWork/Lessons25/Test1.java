package HomeWork.Lessons25;

import HomeWork.Lessons23.A;
import HomeWork.Lessons8.Pi;

import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[] args) {
       /* Mechenosec m = new Mechenosec("Mechenosec");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
        System.out.println();

        Speakable s = new Pingvin("Speakable");
        s.speak();

        System.out.println();

        Animal a = new Lev("Animal");
        System.out.println(a.name);
        a.eat();
        a.sleep();

        System.out.println();

        Mammal m1 = new Lev("Mammal");
        System.out.println(m1.name);
        m1.eat();
        m1.run();
        m1.speak();
        m1.sleep();*/

        Animal a1 = new Mechenosec("M1");
        Animal a2 = new Pingvin("P1");
        Animal a3 = new Lev("L1");
        Fish f1 = new Mechenosec("M2");
        Bird b1 = new Pingvin("P2");
        Mammal m1 = new Lev("L2");
        Mechenosec mech1 = new Mechenosec("M3");
        Pingvin p1 = new Pingvin("P3");
        Lev l1 = new Lev("L3");
        Speakable sp1 = new Lev("L4");
        Speakable sp2 = new Pingvin("P4");

        Animal[] an1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] sp3 = {sp1, sp2, b1, m1, p1, l1};

        for (Animal i : an1) {
            if (i instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) i;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (i instanceof Pingvin) {
                Pingvin p = (Pingvin) i;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (i instanceof Lev) {
                Lev l = (Lev) i;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            System.out.println("----------------------------------------");
        }

        for (Speakable s : sp3) {
            if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.speak();
                l.run();
                l.eat();
                l.sleep();
            } else if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            }
            System.out.println("----------------------------------------");
        }



    }
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Vsegda interesno nabludat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
        ;
    }
}

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {

    public Mechenosec(String name) {
        super(name);
        this.name = name;
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

    public Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Pingvin lybit est ribu");
    }

    @Override
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    @Override
    public void fly() {
        System.out.println("Pingvini ne umeyut letat");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal {
    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Lev, kak lyboy xishnik, lybit myaso");
    }

    @Override
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit");
    }

    @Override
    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka");
    }

}



