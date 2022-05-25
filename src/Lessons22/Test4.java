package Lessons22;

public class Test4 {

}

class Human2 {

    Human2(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
//   Human2(String n){
//       this(n,null);
//   }
//
//    Human2 (String n, String s){
//        name = n;
//        surname = s;
//    }

    public String name;
    public String surname;

}

class Student2 extends Human2{
    int course;
    Student2 (String name, String surname, int course){
        super(name, surname);
        this.course = course;
    }
    public static void main(String[] args) {
        Student2 s = new Student2("Maksim","Perepelica",5);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);;
    }
}
