package Lessons27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("test.txt");
//        int[] array = {4, 8, 1};
//        System.out.println("I have array");
        try {
            FileInputStream fis = new FileInputStream(f);
            /* System.out.println(array[5]); */
            System.out.println("All have good day!");
        } catch (FileNotFoundException e) {
            System.out.println("Was catch exception: " + e);
        } finally {
            System.out.println("This is finally block");
        }

    }
}
