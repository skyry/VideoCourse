package HomeWork;

public class Lessons6 {
    int summ () {
        int output = 0;
        System.out.println(output);
        return output;
    }

    int summ (int a){
        int output = a+0;
        System.out.println(output);
        return output;
    }

    int summ (int a, int b){
        int output = a+b;
        System.out.println(output);
        return output;
    }

    int summ (int a, int b, int c){
        int output = a+b+c;
        System.out.println(output);
        return output;
    }

    int sum(int a, int b, int c, int d){
        int output = a+b+c+d;
        System.out.println(output);
        return output;
    }
}

class Lessons6Test{
    public static void main(String[] args) {
        Lessons6 l = new Lessons6();
        l.summ();
        l.summ(3);
        l.summ(2,2);
        l.summ(5,5,5);
        l.sum(10,10,10,10);

    }
}
