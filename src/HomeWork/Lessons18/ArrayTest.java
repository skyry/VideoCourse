package HomeWork.Lessons18;

import java.util.Arrays;

public class ArrayTest {

    public static int[] sortirovka(int[] array) {
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
        return array;
    }

    public static void main(String[] args) {
        int[] array = {15, 3, 1, 6, 0, 8, 5, 7};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}
