package Lessons27;

import java.io.FileNotFoundException;

public class Test19 {
    public static void main(String[] args) {
        try {
            Animal3 a = new Mouse1();
        }
        catch (FileNotFoundException e){
            System.out.println("Catch exception");
        }

    }
}

class Animal3 {
    Animal3() throws FileNotFoundException {
    }
}

class Mouse1 extends Animal3 {
    Mouse1() throws FileNotFoundException {
        super();
    }
}

class Human{
    String name;
    int age;
    Human(String name, int age)throws Exception{
        if (age<0){throw new Exception("Incorrect age");}
        this.name = name;
        this.age = age;
    }
}
