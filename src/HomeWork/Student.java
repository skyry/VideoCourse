package HomeWork;

public class Student {
    int studId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignAverageGrade;

    double mean (double mathAverageGrade, double economicsAverageGrade, double foreignAverageGrade){
        double result = (mathAverageGrade + economicsAverageGrade + foreignAverageGrade)/3;
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


        System.out.println("Average grade " + st1.name + " " + st1.surname + " = " + st1.mean(5,4.2,4.8));

        System.out.println("Average grade " + st2.name + " " + st2.surname + " = " + st2.mean(4.9,4.5,4.8));

        System.out.println("Average grade " + st3.name + " " + st3.surname + " = " + st3.mean(5,5,4.1));

    }


}
