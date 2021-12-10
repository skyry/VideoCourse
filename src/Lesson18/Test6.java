package Lesson18;

public class Test6 {
    public static void minMax(double[] array) {
        double min = 0;
        double max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                    min = array[i];
                }
            }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


    }

    public static void main(String[] args) {
        double array1[] = {1, 9, 3, -8, 0, 5, 4, 1, -12, 100};
        minMax(array1);
    }


}
