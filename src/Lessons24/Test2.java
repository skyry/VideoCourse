package Lessons24;

public class Test2 {

    public static void main(String[] args) {
        Figura f1 = new Pryamougolnik(4);
        System.out.println(f1.kolichestvoStoron);
        f1.perimetr();
        f1.ploshad();
        f1.showInfo();

    }
}

abstract class Figura {
    Figura(int kolichestvoStoron) {
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {
    Kvadrat(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("Perimetr rvadrata = " + 4 * storona1);
    }

    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    Pryamougolnik(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Perimetr pryamougolnik = " + 2 * (storona1 + storona2));
    }

    public void ploshad() {
        System.out.println("Ploshad pryamougolnik = " + storona1 * storona2);
    }

}

class Okrujnost extends Figura {
    Okrujnost(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    int kolichestvoStoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Perimetr okrujnost = " + 2 * 3.14 + radius);
    }

    public void ploshad() {
        System.out.println("Ploshad okrujnost = " + 3.14 * radius * radius);
    }

}

abstract class Chetirehugolnik extends Figura {
    Chetirehugolnik(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    }

    void def() {
        System.out.println("Eto chetirehugolnik");
    }
}

