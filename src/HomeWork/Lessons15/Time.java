package HomeWork.Lessons15;

public class Time {
    static void time() {
        int hour = 0;
        OUTER:
        while (hour < 24) {
            MIDDLE:
            do {
                int minute = 0;
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;}
                }

                int seconds = 0;
                INNER:
                while (seconds < 60) {

                    if (seconds * hour > minute) {
                        continue;
                    }

                    System.out.println(hour + ":" + minute + ":" + seconds);

                }
            }
        }

        public static void main (String[]args){
            time();
        }

}
