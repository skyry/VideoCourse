package HomeWork.Lessons18;

import java.util.Arrays;

public class ArrayTest {

    public static void sortirovka(int[] array) {
        //Arrays.sort(array);
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j=i+1; j<array.length;j++){
                if (array[i]>array[j]&&array[j]<array[j-1]){
                    a=array[j];
                    b=j;
                    array[b] = array[i];
                    array[i] = a;
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
