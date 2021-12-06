package Lesson17;

public class Test1 {
    public static void main(String[] args){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("d"));
        System.out.println(sb2.indexOf("d",4));
        System.out.println(sb2.indexOf("!!!"));
        System.out.println(sb2.substring(2));
        System.out.println(sb2.substring(2,8));
        System.out.println(sb2.subSequence(3,9));

//        sb2.append(22);
//        System.out.println(sb2);
//        sb2.append(true);
//        System.out.println(sb2);

        //System.out.println(sb2.insert(4,55));
        //System.out.println(sb2.insert(5,"super "));

        StringBuilder sb5 = new StringBuilder("Hello World");
        //sb5.delete(3,8);
        //sb5.deleteCharAt(6);
        sb5.reverse();
        System.out.println(sb5);
        StringBuilder sb6 = new StringBuilder("Vsem privet");
        sb6.replace(0,5,"Pete");
        System.out.println(sb6);
        System.out.println(sb6.capacity());
        System.out.println(sb1.capacity());



    }
}
