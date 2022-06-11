package Lessons27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test1.txt");
            System.out.println("File is find");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("Have problem with stream fis2");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NullPointerException e) {
            System.out.println("Catch NullPointerException ");
        }
    }

}
