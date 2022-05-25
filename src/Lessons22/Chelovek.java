package Lessons22;

public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;

    //проводим инкапсуляцию для переменной name
    public String getName() {
        return name;
    }

    //проводим инкапсуляцию для переменной name
    public void setName(String s) {
        name = s;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Ivan");
        c.setVozrast(25);
        c.setVes(65);

        System.out.println("Name = " + c.getName());
        System.out.println("Vozrast = " + c.getVozrast());
        System.out.println("Ves = " + c.getVes());
    }
}
