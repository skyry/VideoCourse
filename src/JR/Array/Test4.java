package JR.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test4 {
    public static void main(String[] args) throws Exception {
        int[] array1 = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array1.length; i++) {
            String st1 = bufferedReader.readLine();
            array1[i] = Integer.parseInt(st1);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array1[i]);
        }
    }
}
