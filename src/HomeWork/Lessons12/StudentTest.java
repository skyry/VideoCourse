package HomeWork.Lessons12;

import Lesson11.Student;

public class StudentTest {

    public static void equal(Student s1, Student s2) {
        if (s1.name == s2.name && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }


    public static void equal2(Student s1, Student s2) {
        if (s1.name == s2.name) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Студенты равны");
                } else System.out.println("Студенты не равны по grade");
            } else System.out.println("Студенты не равны по course");
        } else System.out.println("Студенты не равны по name");

    }


    public static void main(String[] args) {
        Student s1 = new Student("Petr", 5, 9.5);
        Student s2 = new Student("Ivan", 4, 9.0);
        StudentTest.equal(s1, s2);
        StudentTest.equal2(s1, s2);
    }
}
