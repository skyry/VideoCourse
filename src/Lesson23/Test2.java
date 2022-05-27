package Lesson23;

public class Test2 {
    //public Object abc() {return new Doctor();} // Если у метода return type- Object, то можно вернуть любой обьект, т.к. любой объект в JAVA это Object

    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();
//        Hirurg h = new Hirurg();

        Employee emp1 = new Doctor(); //Doctor this is Employee
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
        //emp1.lechit(); //Вызвать можем только переменные и методы Employee


        Employee emp2 = new Teacher();//Teacher this is Employee
        Employee emp3 = new Driver();//Driver this is Employee
        //Driver drv = new Employee();//Не каждый работник может быть водителем


        Doctor d2 = new Hirurg();
        Employee emp4 = new Hirurg();

    }
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


class Doctor extends Employee {

    String specializaciya;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Hirurg extends Doctor {
    String skalpel;

    void operaciya() {

    }
}

class Teacher extends Employee {

    String lplichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}

class Driver extends Employee {

    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }
}
