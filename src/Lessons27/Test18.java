package Lessons27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test18 {
}

class Animal2{
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal2{
    void run() throws FileNotFoundException {  //exception только то, что в supper class (IOException) или его sub class (FileNotFoundException)
        System.out.println("Animal runs");
    }
}
