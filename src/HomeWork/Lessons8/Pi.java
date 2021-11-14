package HomeWork.Lessons8;

public class Pi {
    static final double pi = 3.14;

    double ploshad(double radius) {
        double p = pi * radius * radius;
        return p;
    }

    static double dlinaOkr(double radius2) {
        double p1 = 2 * pi * radius2;
        return p1;
    }

    void allParametrs(double radius3) {
        System.out.println("Радиус" + radius3);
        System.out.println("Площадь" + ploshad(radius3));
        System.out.println("Длина окружности" + dlinaOkr(radius3));
    }

}

class PiTest {
    public static void main(String[] args) {
        Pi t = new Pi();
        System.out.println("Длина окружности " +Pi.dlinaOkr(10));
        System.out.println("Площадь " + t.ploshad(10));
        t.allParametrs(10);

    }

}
