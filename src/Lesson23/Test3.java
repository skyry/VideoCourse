package Lesson23;

class Test3 {
    public static void main(String[] args) {
//        EmployeeNew e = new EmployeeNew();
//        TeacherNew t = new TeacherNew();
//        e.eat();
//        t.eat();
        EmployeeNew e1 = new TeacherNew();
        e1.eat();
    }

}

class Eda{ }
class Fruit extends Eda{}

class EmployeeNew {
    String name;
    int age;
    int experience;

    public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("Spat");
    }
}


class TeacherNew extends EmployeeNew {
    //Overriding метода eat
    @Override
    public Eda eat() {
        System.out.println("Kushaet uchitel");
        Eda e = new Eda();
        return e;
    }

    String lplichestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }
}