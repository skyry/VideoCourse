package Lessons22;

public class Test3 {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 55;
        doc.experience = 25;
        doc.eat();
        doc.specializaciya = "Hirurg";
        doc.sleep();
        doc.lechit();
    }

}


class Employee{
    String name;
    int age;
    int experience;
    void eat(){System.out.println("Kushat");}
    void sleep(){System.out.println("Spat");}
}


class Doctor extends Employee {

    String specializaciya;
    void lechit(){System.out.println("Lechit");}
}

class Teacher extends Employee {

    String lplichestvoUchenikov;
    void uchit(){System.out.println("Uchit");}
}

class Driver extends Employee {

    String nazvanieMashini;
    void vodit(){System.out.println("Vodit");}
}