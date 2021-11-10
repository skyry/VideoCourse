package Lesson6;

public class Employee {
    Employee (int id2, String surname2, int age2) {
         id= id2;
         surname = surname2;
        age = age2;

    }

    Employee(String surname2, int age2){
        surname = surname2;
        age = age2;
    }



    int id;
    String surname;
    int age;
    double salary;
    String department;
}


class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Ivanov",25);
        Employee emp2 = new Employee("Gorik",39);
        System.out.println(emp.surname);
        System.out.println(emp2.surname);
    }
}
