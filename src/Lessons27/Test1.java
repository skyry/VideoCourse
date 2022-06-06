package Lessons27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal{
    int a = 5;
    static int b = 10;
    void abc(){
        System.out.println("Non-static method class Animal");
    }
    static void def(){
        System.out.println("Static method class Animal");
    }
}


class Tiger extends Animal{
    int a = 15;
    static int b = 20;
    void abc(){
        System.out.println("Non-static method class Tiger");
    }
    static void def(){
        System.out.println("Static method class Tiger");
    }
}

