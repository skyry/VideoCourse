package Lessons26;

public class Test5 {
    {
        System.out.println("This is init block 3");
    }
    Test5(){
        System.out.println("This is constructor 1");
    }
    Test5(int a){
        this(); //вызываем свой overload constructor
        System.out.println("This is constructor 2");
    }
    {
        System.out.println("This is init block 1");
    }

    static {
        System.out.println("This is static init block 1");
    }
    {
        System.out.println("This is init block 2");
    }
    static {
        System.out.println("This is static init block 2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5(3);
    }
}
