package Lessons25;

import HomeWork.Lessons10.P4.D;
import HomeWork.Lessons10.P4.P5.E;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        /*Doctor[] array1 = {new Doctor(), new Doctor()};
        Employee[] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Help_able[] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        ArrayList<Employee> al1 = new ArrayList<>();
        al1.add(new Doctor());
        al1.add(new Teacher());
        al1.add(new Driver());*/

    /*    Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();


        Employee[] array4 = {emp1, emp2, emp3};

        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Help_able);
        System.out.println(emp1 instanceof Driver);
        System.out.println(emp1 instanceof Doctor);*/

       /* for(Employee emp:array4){
            emp.work();
            emp.sleep();
        }*/

        /*emp1.work();
        emp2.work();
        emp3.work();*/
    }
}

/*
abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }

    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Driver helps");
    }

    @Override
    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Doctor helps");
    }

    @Override
    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}
*/
