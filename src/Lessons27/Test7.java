package Lessons27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder rezult = new StringBuilder("");

        try {
            File f = new File("test.txt");
            System.out.println("Object file is created");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream is created");
            int count = 0;
            while (true) {
                count++;
                rezult.append(fis.read());
                System.out.println("Information is reading");
                if (count == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception_1: " + e);
        } catch (IOException e) {
            System.out.println("Catch exception_2: " + e);
        } finally {
            System.out.println("This is finally");
            System.out.println(rezult.toString());
        }
    }
}
