package Lesson19;

public class Test2 {
    static void summa(String s, int... a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
        }
        System.out.print(s);
        System.out.println(summ);

    }

    public static void main(String[] args) {
        summa("Summa: ", 5, 5, 5);
        summa("Summa_2: ",new int[]{5,5,5,5,5});
    }


}
