package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array) {
            sb.append(" Java ");
        }

        for (StringBuilder sb : array) {
            System.out.print(sb);
        }
    }
}
