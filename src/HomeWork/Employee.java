package HomeWork;

public class Employee {
    Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;


    double upSalary() {
        salary *= 2;
        return salary;
    }
}


class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Petrov", 25, 200, "Technical");
        Employee e2 = new Employee(2, "Ivanov", 40, 500, "IT");
        System.out.println("Salary e1: " + e1.salary);
        e1.upSalary();
        System.out.println("Salary after up e1: " + e1.salary);
        System.out.println("Salary e2: " + e2.salary);
        e2.upSalary();
        System.out.println("Salary after up e2: " + e2.salary);
    }
}
