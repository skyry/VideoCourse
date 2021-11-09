package Lesson5;

public class Test20 {

    int summ (int a, int b, int c){
        int result = a + b + c;
        return result;
    }

    int average(int a1, int b1, int c1){
        int result2 = summ(a1,b1,c1)/3;
        return result2;
    }
}

class Test21{
    public static void main(String[] args) {
        Test20 summa = new Test20();
        int summaTrexChisel = summa.summ(5,5,5);
        int averSumm = summa.average(5,5,9);
        System.out.println(summaTrexChisel);
        System.out.println(averSumm);
    }
}