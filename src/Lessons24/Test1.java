package Lessons24;

public class Test1 {

}

class A{
    String s = "Hi";
    void abc(){
        System.out.println("???");
    }
}

class B extends A{
    String s = "Bye";
    @Override
    void abc(){
        System.out.println("!!!");
    }
}

class C extends B{
    public static void main(String[] args) {
        A c  = new C();
        c.abc();
        System.out.println(c.s);
    }
}
