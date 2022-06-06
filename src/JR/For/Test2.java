package JR.For;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        int in1 = Integer.parseInt(s1);
        int in2 = Integer.parseInt(s2);

        for (int i=0; i<in1; i++){
            for (int j=0; j<in2; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
