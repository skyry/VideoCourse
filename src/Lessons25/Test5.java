package Lessons25;

public class Test5 {
}

class Test10{
    int a = 5;
    void abc (){
        System.out.println("OK1");
    }
}

class Test20 extends Test10{
    int a = 15;
    void abc (){
        System.out.println("OK2");
    }
}

class Test30 extends Test20{
    int a = 20;
    void abc (){
        System.out.println("OK3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);
        ((Test20)t).abc();
    }
}
