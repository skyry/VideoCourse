package Lessons27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test.txt");
            try {
                fis2 = new FileInputStream("test2.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File2 not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File1 not found");
        } finally {
            System.out.println("It is out finally block");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Find exception in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}



