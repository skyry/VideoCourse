package Lesson18;

public class Test6 {
    public static void minMax(double[] array) {
        double min = array[0];
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                    min = array[i];
                }
            }

        System.out.print("Min = " + min);
        System.out.println(" Max = " + max);


    }

    public static void main(String[] args) {
        double array1[] = {1, 9, 3, -8, 0, 5, 4, 1, -15, 99};
        minMax(array1);
        minMax(new double[]{1,2,3,45,450,-49,-2,-3});
    }


}
