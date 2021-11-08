package Lesson5;

public class Test20 {

    int summ (int a, int b, int c){
        int result = a + b + c;
        return result;
    }
}



class Test21{
    public static void main(String[] args) {
        Test20 summa = new Test20();
        int summaTrexChisel = summa.summ(5,5,5);
        System.out.println(summa.summ(5, 5,5));
    }
}