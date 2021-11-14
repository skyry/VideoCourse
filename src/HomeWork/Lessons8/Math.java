package HomeWork.Lessons8;

public class Math {


    static int proizv(int a1, int b1, int c1) {
        return a1 * b1 * c1;
    }

    static void del(int a1, int a2) {
        int c1 = a1 % a2;
        System.out.println("Целое число = " + a1 / a2);
        System.out.println("Остаток = " + a1 % a2);
    }
}


class MathTest {

    public static void main(String[] args) {
        System.out.println("Proizvedenie = " + Math.proizv(2, 2, 2));
        System.out.println("Proizvedenie = " + Math.proizv(7, 9, 5));

        Math.del(50, 8);
        Math.del(79, 5);
    }
}
