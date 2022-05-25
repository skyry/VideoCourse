package Lessons22.p1;

import Lessons22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Ivan");
        c.setVozrast(25);
        c.setVes(65);

        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
