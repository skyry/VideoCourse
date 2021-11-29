package HomeWork.Lessons15;

public class Time {
    static void time() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }

                int seconds = 0;
                INNER:
                while (seconds < 60) {
                    if (seconds * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + seconds);
                    seconds++;
                }


            }
            while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
