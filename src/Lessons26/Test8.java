package Lessons26;

import java.util.Date;

public class Test8 {
}


class X{
    static String s = "";
    {s+="A";}
    static {s+="B";}
    {s+="C";}

}

class Y{
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(X.s);
        System.out.println(X.s);
        new X();
        new X();
        System.out.println(X.s);
    }
}