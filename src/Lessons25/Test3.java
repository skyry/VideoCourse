package Lessons25;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor d1 = (Doctor) emp1;
        System.out.println(d1.specializaciya);
        d1.lechit();

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

    String specializaciya = "Hirurg";
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
