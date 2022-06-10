package Lessons27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8_1 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Hello");
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception: " + e);
            System.out.println("a in catch block = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("This is block finally");
            System.out.println("a in finally block = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }
}
