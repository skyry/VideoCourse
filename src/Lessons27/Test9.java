package Lessons27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception: " + e);
            throw e;
        } finally {
            System.out.println("This is block finally");
        }
    }

    void method () throws FileNotFoundException{
        abc();
    }

//    public static void main(String[] args) {
//        System.out.println(abc());
//
//    }
}
