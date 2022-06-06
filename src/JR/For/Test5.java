package JR.For;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(s1);
        }
    }
}
