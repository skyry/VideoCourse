package JR.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = new String[10];
        int[] array1 = new int[10];


        for (int i = 0; i < st1.length; i++) {
            st1[i] = bufferedReader.readLine();
        }
        for (int i = 0; i < 10; i++) {
            array1[i] = st1[i].length();
        }

        for (int i : array1
        ) {
            System.out.println(i);

        }


    }
}
