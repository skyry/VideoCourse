package HomeWork;

public class Student2 {

    Student2(int studId1, String name1, String surname1, int cours1, double mathAverageGrade1, double economicsAverageGrade1, double foreignAverageGrade1){

        studId = studId1;
        name = name1;
        surname = surname1;
        course = cours1;
        mathAverageGrade = mathAverageGrade1;
        economicsAverageGrade = economicsAverageGrade1;
        foreignAverageGrade = foreignAverageGrade1;
    }

    Student2(int studId, String name, String surname, int cours){

        this(studId, name, surname,cours, 0.0,0.0,0.0);
    }

    Student2(){

    }


    int studId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignAverageGrade;

    double mean(Student st) {
        double result = (st.economicsAverageGrade + st.economicsAverageGrade + st.economicsAverageGrade) / 3;
        System.out.println("Average grade " + st.name + " " + st.surname + " = " + result);
        return result;
    }
}


class StudentTest2 {
    public static void main(String[] args) {

        Student2 st1 = new Student2(1,"Viktor","Pushkin",1,5,4.2,4.8);
        Student2 st2= new Student2(2,"Slava","Ivanov",2);
        Student2 st3 = new Student2();

        System.out.println(st1.name);
        System.out.println(st2.surname);
        System.out.println(st3.course);

    }


}
