package Lessons25;

import HomeWork.Lessons10.P4.P5.E;

public class Test3 {
    public static void main(String[] args) {
        //Help_able h = new Doctor();
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        //Doctor d1 = (Doctor) emp1;
       /* System.out.println(((Doctor)emp1).specializaciya);
        ((Doctor) emp1).lechit();

        System.out.println(((Doctor)h).specializaciya);
        ((Doctor)h).help();*/

        //System.out.println(h instanceof Doctor);
        Employee[] array = {emp1,emp2,emp3,emp4};
        for(Employee e: array){
            if(e instanceof Driver){
                System.out.println(((Driver) e).nazvanieMashini);
                ((Driver)e).vodit();

            }
        }
    }

}
class Employee{
    String name;
    int age;
    int experience;
    void eat(){System.out.println("Kushat");}
    void sleep(){System.out.println("Spat");}
}


class Doctor extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Doctor okazivart pomosh");
    }

    String specializaciya = "Hirurg";
    void lechit(){System.out.println("Lechit");}
}

class Teacher extends Employee {

    String lplichestvoUchenikov;
    void uchit(){System.out.println("Uchit");}
}

class Driver extends Employee {

    String nazvanieMashini = "Renault Scenic";
    void vodit(){System.out.println("Vodit Scenic");}
}

interface Help_able{
    void help();
}