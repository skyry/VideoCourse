package Lessons26;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("Hello");
        C c = new C();
    }
}


class C {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

     static {
        System.out.println(i);
    }

     static {
        i = i + 1;
        System.out.println(i);
    }

    C() {
        System.out.println("This is constructor");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        C c = new C();
    }


}

class D{
    static {abc(2);}
    static void abc(int a){
        System.out.println("Number: "+a);
    }
    D(){abc(5);}
    static {abc(4);}
    {abc(6);}
    static {new D();}
    {abc(8);}

    public static void main(String[] args) {

    }
}
