package Lesson11;

import javax.swing.plaf.synth.SynthUI;
import java.sql.Struct;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap (Student s1, Student s2){
        Student s3 = s1;
        s2 = s1;
        s1 = s3;
    }

    public static void changeName(Student s1){
        s1.name = "Vasil";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 5, 9.5);
        Student s2 = new Student("Petr", 1, 5.3);
        changeName(s1);

        System.out.println(s1.name);
    }
}
