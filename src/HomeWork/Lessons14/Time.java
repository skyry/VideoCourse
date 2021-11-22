package HomeWork.Lessons14;

import javax.sound.midi.MidiDevice;

public class Time {
    static void time() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {

                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }

                INNER:
                for (int seconds = 0; seconds <= 60; seconds++) {

                    if (seconds * hour > minute) {
                        continue;
                    }

                    System.out.println(hour + ":" + minute + ":" + seconds);

                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }

}
