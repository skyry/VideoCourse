package Lessons26;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //autoboxing
        list.add(5);
        Long l = 50L;

        //unboxing
        int a = list.get(0);
        Integer b = new Integer(10);
        int c = b;

        //метод parse
        String s1 = "50";
        String s2 = "true";
        String s3 = "3.14";
        int i1 = Integer.parseInt(s1); //конвертируем String в int
        System.out.println(i1);
        boolean b1 = Boolean.parseBoolean(s2); //конвертируем String в boolean
        System.out.println(b1);

        //метод valueOf
        Integer i3 = Integer.valueOf(10);
        Double d1 = Double.valueOf(3.15);
        Double d2 = Double.valueOf(s3);
        System.out.println(i3);
        System.out.println(d1);
        System.out.println(d2);

        Byte b2 = Byte.valueOf((byte) 5);
        System.out.println(b2);

    }
}
