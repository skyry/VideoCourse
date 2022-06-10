package Lessons27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class Test8 {
    static int abc() {
        int a = 5;
        try {
            File f = new File("test1.txt");
            FileInputStream fis = new FileInputStream(f);
            //return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception: " + e);
            System.out.println("a in catch block = " + a);
            return a;
        } finally {
            a = 10;
            System.out.println("This is block finally");
            System.out.println("a in finally block = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }

}
