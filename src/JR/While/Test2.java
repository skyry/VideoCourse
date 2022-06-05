package JR.While;

public class Test2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a != 10) {
            while (b != 10) {
                System.out.print("S");
                b++;
            }
            b = 0;
            System.out.println();
            a++;
        }
    }
}
