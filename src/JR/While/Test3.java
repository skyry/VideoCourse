package JR.While;

public class Test3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 2;
        int count = 2;

        while (a != 11) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        while (b != 11) {
            System.out.print(b + " ");
            while (c != 11) {
                a = count;
                int proiz = c * a;
                System.out.print(proiz + " ");
                a++;
                c++;
            }
            count++;
            System.out.println();
            b++;
            c = 2;
        }
    }
}


