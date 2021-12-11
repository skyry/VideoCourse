package HomeWork.Lessons18;

import java.util.Arrays;

public class ArrayTest {

    public static int[] sortirovka(int[] array) {
        //Arrays.sort(array);
        int a;
        for (int i = 0; i < array.length; i++) {
            int index1 = array[i];
            for (int j=i+1; j<array.length;j++){
                int index2 = array[j];

            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {9, 15, 5, 2, 4, 8, 1, 0};
        sortirovka(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

}
