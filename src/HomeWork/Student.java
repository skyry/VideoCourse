package HomeWork;

public class Student {
    int studId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignAverageGrade;

    double mean (Student st1){
        double result = (st1.economicsAverageGrade + st1.economicsAverageGrade + st1.economicsAverageGrade)/3;
        System.out.println("Average grade " + st1.name + " " + st1.surname + " = " + result);
        return result;
    }
}


class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.studId = 1;
        st1.name = "Viktor";
        st1.surname = "Pustov";
        st1.mathAverageGrade = 5;
        st1.economicsAverageGrade = 4.2;
        st1.foreignAverageGrade = 4.8;
        st1.mean(st1);


        Student st2 = new Student();
        st2.studId = 2;
        st2.name = "Serhii";
        st2.surname = "Petrov";
        st2.mathAverageGrade = 4.9;
        st2.economicsAverageGrade = 4.5;
        st2.foreignAverageGrade= 4.8;

        Student st3 = new Student();
        st3.studId = 3;
        st3.name = "Petro";
        st3.surname = "PIvanov";
        st3.mathAverageGrade = 5;
        st3.economicsAverageGrade = 5;
        st3.foreignAverageGrade = 4.1;


    }


}
