package Lessons31;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        for (int i =1; i<10; i++){
            al.add(i);
        }
        ArrayList<String> al2 = new ArrayList<>();
        for (int i = 0; i<10; i++){
            al2.add("Hello "+i);
        }
        System.out.println(GenMethod.getSecondElement(al));

        System.out.println(GenMethod.getSecondElement(al2));

    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(8);
    }
}
