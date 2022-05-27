package HomeWork.Lessons22;

public class Student {
    private StringBuilder name = new StringBuilder();
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course > 0 & course < 5) {
            this.course = course;
        }

    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 & grade < 11) {
            this.grade = grade;
        }
    }

    public void showInfo() {

        System.out.println("Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }

}


class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Ivan"));
        s.setCourse(4);
        s.setGrade(10);
        s.showInfo();
    }
}
