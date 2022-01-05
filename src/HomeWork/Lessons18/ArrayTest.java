package HomeWork.Lessons18;

import java.util.Arrays;

public class ArrayTest {

    public static void sortirovka(int[] array) {
        //Arrays.sort(array);
        int a;
        int b;
        for (int i = 0; i < array.length; i++) {
            int index1 = array[i];
            for (int j=i+1; j<array.length;j++){
                int index2 = array[j];
                if (index1>index2){
                    a=index1;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 15, 5, 2, 4, 8, 1, 0};
        sortirovka(array);
    }

}
