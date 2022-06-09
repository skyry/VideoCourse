package Lessons27;

import HomeWork.Lessons9.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    void abc() throws FileNotFoundException  {
        File f = new File("test1.txt");
        //try {
        FileInputStream fis = new FileInputStream(f);
        //fis.read();
        // System.out.println(array[5]);
        System.out.println("All have good day!");
//        } catch (FileNotFoundException e) {
//            System.out.println("Was catch exception: " + e);
//        } catch (IOException e) {
//            System.out.println("Was catch exception: " + e);
//        } finally {
//            System.out.println("This is finally block");
//        }
    }

    void def() {
        System.out.println("Hi");
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Was catch exception: " + e);
        }

    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.def();

//        int[] array = {4, 8, 1};
//        System.out.println("I have array");


    }
}
