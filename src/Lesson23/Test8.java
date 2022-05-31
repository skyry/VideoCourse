package Lesson23;

public class Test8 {
}

interface I2{
    private static void method1(){
        System.out.println("Static methd");
    }
    private void method2(){
        System.out.println("Non-static method");
    }
    default void method3(){
        method1();
    }
    static void method4(){
        method1();
    }
}
