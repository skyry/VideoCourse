package Lessons24;


import javax.management.MBeanAttributeInfo;

public class Test5 {
}

interface I1{
    void abc();
    default void def(){
        System.out.println("This is method def");
    }
    static void def1(){
        System.out.println("This is static method");
    }
}



class Z2 implements I1{
    @Override
    public void abc() {
        System.out.println("This is method abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        z.def();
    }

}