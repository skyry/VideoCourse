package Lessons22;

public class Test1 {
    public static void main(String[] args) {
        int i = 2;
        String s = new String[]{"A", "B", "C", "D"}[i]; // [2] - указываем на элемент массива
        System.out.println(s); // выводит 2-й элемент массива ("C")
    }

}
