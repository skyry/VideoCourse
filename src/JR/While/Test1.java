package JR.While;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        String numb = bufferedReader.readLine();
        int numbInt = Integer.parseInt(numb);

        while (numbInt != 0) {
            System.out.println(line);
            numbInt--;
        }


    }
}
