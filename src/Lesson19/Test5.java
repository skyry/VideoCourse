package Lesson19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};
        for (String i : students) {
            for (String j : exams) {
                System.out.println(i + " " + j);
            }

        }
    }
}
