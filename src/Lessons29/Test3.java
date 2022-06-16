package Lessons29;

import java.util.ArrayList;

public class Test3 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    static void printStudent(Student st) {
        System.out.println("Name student: " + st.name + ", sex: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", average grade: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student> al, StudentCheks sc) {
        for (Student s : al) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Mikola", 'm', 20, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petro", 'm', 35, 4, 4.7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();

        System.out.println("---------------------------OverGrade--------------------------------");
        si.testStudents(list, (Student st) -> {
            return st.avgGrade > 8.5;                   //полный вариант написания lambda expressions
        });
        System.out.println("---------------------------UnderGrade-------------------------------");
        si.testStudents(list, st -> st.avgGrade < 9); //короткий вариант написания lambda expressions
        System.out.println("----------------------------OverAge---------------------------------");
        si.testStudents(list, st -> {
            return st.age > 25;                       //смешаный вариант написания lambda expressions
        });
        System.out.println("----------------------------UnderAge--------------------------------");
        si.testStudents(list, (Student st) -> st.age < 27); //смешаный вариант написания lambda expressions
        System.out.println("------------------------------BySex---------------------------------");
        si.testStudents(list, (Student st) -> {
            return st.sex == 'm';                       //полный вариант написания lambda expressions
        });
        System.out.println("--------------------------MixConditions-----------------------------");
        si.testStudents(list, (Student st) -> {
            return st.avgGrade > 7.2 && st.age < 23 && st.sex == 'f'; //полный вариант написания lambda expressions
        });


    }

}

interface StudentCheks {
    boolean test(Student s);
}



