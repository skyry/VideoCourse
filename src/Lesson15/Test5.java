package Lesson15;

public class Test5 {
    public static void main(String[] args) {

        int chas = 0;
        OUTER:
        do {
            int minute = 0;

            INNER:
            while (minute < 60) {
                System.out.println(chas + ":" + minute);
                minute++;
            }
            chas++;

        }
        while (chas < 24);
    }
}
