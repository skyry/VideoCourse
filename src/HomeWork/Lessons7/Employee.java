package HomeWork.Lessons7;

public class Employee {

    Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    double upSalary() {
        salary *= 2;
        return salary;
    }

    public void salary (){
        System.out.println(salary);
    }

    public void String (){
        System.out.println(surname);
    }

    public void id (){
        System.out.println(id);
    }

    public Employee (int id1, String surname1){
        id =id1;
        surname = surname1;
    }

    Employee(int age1, String surname1, double salary1){
        age = age1;
        surname = surname1;
        salary = salary1;
    }

    private Employee(int id1, int age1){
        id = id1;
        age = age1;
    }
}


class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Petrov", 25, 200, "Technical");
        Employee e2 = new Employee(2, "Ivanov", 40, 500, "IT");
        System.out.println(e1.surname);

    }
}
