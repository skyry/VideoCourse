package Lessons29;

import java.util.ArrayList;

public class Test2 {
}

/*class Student {
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
        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
        FindStudentsOverAge fsoa = new FindStudentsOverAge();
        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
        FindStudentsBySex fsbs = new FindStudentsBySex();
        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();

        System.out.println("---------------------------OverGrade--------------------------------");
        si.testStudents(list, fsog);
        System.out.println("---------------------------UnderGrade-------------------------------");
        si.testStudents(list, fsug);
        System.out.println("----------------------------OverAge---------------------------------");
        si.testStudents(list, fsoa);
        System.out.println("----------------------------UnderAge--------------------------------");
        si.testStudents(list, fsua);
        System.out.println("------------------------------BySex---------------------------------");
        si.testStudents(list, fsbs);
        System.out.println("--------------------------MixConditions-----------------------------");
        si.testStudents(list, fsmc);


    }

}

interface StudentCheks {
    boolean test(Student s);
}

class FindStudentsOverGrade implements StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.avgGrade < 9;
    }
}

class FindStudentsOverAge implements StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.age > 25;
    }
}

class FindStudentsUnderAge implements StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.age < 27;
    }
}

class FindStudentsBySex implements StudentCheks {
    @Override
    public boolean test(Student s) {
        return s.sex == 'm';
    }
}

class FindStudentsMixCondition implements StudentCheks {
    @Override
    public boolean test(Student s) {
        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'f');
    }
}*/
