package JR;

import java.io.*;

public class Input {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String name = bufferedReader.readLine();
        String sAge = bufferedReader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println("Name: " + name + " Age: " + nAge);
    }

}
