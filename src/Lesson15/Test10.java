package Lesson15;

public class Test10 {
    public static void main(String[] args) {
        OUTER:
        for (int chas = 1; chas < 24; chas++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(chas + ":" + minute);
                minute++;
            }

        }
    }
}
