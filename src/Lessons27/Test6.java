package Lessons27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {

        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (NullPointerException e) {
            System.out.println("Catch exception_2: " + e);
        } catch (FileNotFoundException e) {
            System.out.println("Catch exception_1: " + e);
        } catch (IOException e) {
            System.out.println("Catch exception_3: " + e);
        } catch (RuntimeException e) {
            System.out.println("Catch exception_4: " + e);
        } catch (Exception e) {
            System.out.println("Catch exception_5: " + e);
        } catch (Throwable e) {
            System.out.println("Catch exception_6: " + e);
        }
    }
}
