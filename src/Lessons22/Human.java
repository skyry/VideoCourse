package Lessons22;

public class Human {
//    Human (String n){
//        name = n;
//    }

    public String name = "Maksim";
    public static int salary = 150;
    public void work (){
        System.out.println("Rabotat");
    }
    public static void rest(){
        System.out.println("Otdihat");
    }


}


class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();

    }

}
