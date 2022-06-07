package JR.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) throws Exception {
        String[] st1 = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            st1[i] = bufferedReader.readLine();
        }

        for (int i = 7; i>=0; i--) {
            System.out.println(st1[i]);
        }
    }
}
