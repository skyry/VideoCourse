package Lessons25;

public class Test4 {
    public static void main(String[] args) {
        String [] array1 = {"Hello", "Bye"};
        Object [] array2 = array1;
        String [] array3 = (String[]) array2;
        //array3 [0] = new StringBuilder("Ok");
        array2[0] = new StringBuilder("OK");

    }
}
