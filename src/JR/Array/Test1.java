package JR.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        //System.out.println();
        System.out.println(max);
    }

    public static int[] initializeArray() throws Exception {
        int[] array = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            String s1 = bufferedReader.readLine();
            int number = Integer.parseInt(s1);
            array[i] = number;
        }
        return array;
    }

    public static int max(int[] array) {
        int m = 0;
        for (int i : array) {
            if (i > m) {
                m = i;
            }
        }
        return m;
    }
}


