package Lesson14;

public class Test5 {
    public void time() {
        OUTER:
        for (int hour = 0; hour <= 24; hour++) {
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);

                if (minute == 45) {
                    break OUTER;
                }

            }
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.time();
    }
}
