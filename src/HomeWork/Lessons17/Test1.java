package HomeWork.Lessons17;

public class Test1 {

    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Test1 r = new Test1();

        System.out.println(r.ravenstvo(new StringBuilder("Privet"),new StringBuilder("Privet")));
        System.out.println(r.ravenstvo(new StringBuilder("Privet"),new StringBuilder("privet")));




    }

}
