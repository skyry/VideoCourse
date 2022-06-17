package HomeWork.Lessons29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test1 {
}

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}

class TestEmployee {
    static void printEmployee(Employee emp) {
        System.out.println("Name: " + emp.name + ", department: " + emp.department + ", salary: " + emp.salary);
    }

    void filtrEmployee(ArrayList<Employee> list, Predicate<Employee> emp) {
        for (Employee i : list) {
            if (emp.test(i)) {
                printEmployee(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Ivan", "IT", 600);
        Employee emp2 = new Employee("Petro", "Driver", 600);
        Employee emp3 = new Employee("Igor", "Engineer", 450);
        Employee emp4 = new Employee("Evgen", "IT", 500);
        Employee emp5 = new Employee("Alex", "IT", 150);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        TestEmployee t1 = new TestEmployee();
        t1.filtrEmployee(list,x->x.department=="IT"&&x.salary>200);
        System.out.println("----------------------------------------");
        t1.filtrEmployee(list,x->x.name == "");

    }

}


