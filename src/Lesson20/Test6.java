package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        /*
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();
        list1.get(0).append("!!!");
        list1.set(0, new StringBuilder("D"));

        System.out.println(list1.toString());
        System.out.println(list2.toString());
        */

        /*
        Object [] array1 = list1.toArray();
        for(Object i: array1){
            System.out.print(i+" ");
        }


        StringBuilder [] array1= list1.toArray(new StringBuilder[10]);
        for (StringBuilder i:array1){
            System.out.print(i+" ");
        }

         */

        StringBuilder[] array = {sb1, sb2, sb3, sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);


    }
}
