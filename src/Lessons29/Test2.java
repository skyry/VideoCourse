package Lessons29;

import java.util.ArrayList;

public class Test2 {
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

    void printStudentsOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student i : aL) {
            if (i.avgGrade > avgGrade) {
                printStudent(i);
            }

        }

    }

    void printStudentsUnderGrade(ArrayList<Student> aL, double underGrade) {
        for (Student i : aL) {
            if (i.avgGrade < underGrade) {
                printStudent(i);
            }

        }
    }

    void printStudentsOverAge(ArrayList<Student> aL, int age) {
        for (Student i : aL) {
            if (i.age > age) {
                printStudent(i);
            }

        }
    }

    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
        for (Student i : aL) {
            if (i.age < age) {
                printStudent(i);
            }

        }
    }

    void printStudentsBySex(ArrayList<Student> aL, char sex) {
        for (Student i : aL) {
            if (i.sex == sex) {
                printStudent(i);
            }

        }
    }

    void printStudentsMixConditions(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student i : aL) {
            if (i.avgGrade > avgGrade && i.age < age && i.sex == sex) {
                printStudent(i);
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
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("---------------------------UnderGrade-------------------------------");
        si.printStudentsUnderGrade(list, 8.5);
        System.out.println("----------------------------OverAge---------------------------------");
        si.printStudentsOverAge(list, 25);
        System.out.println("----------------------------UnderAge--------------------------------");
        si.printStudentsUnderAge(list, 27);
        System.out.println("------------------------------BySex---------------------------------");
        si.printStudentsBySex(list, 'm');
        System.out.println("--------------------------MixConditions-----------------------------");
        si.printStudentsMixConditions(list, 7.2, 23, 'f');


    }

}
