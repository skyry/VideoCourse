package Lessons27;

public class Test16 {
    public static void main(String[] args) {
    createPwd("helloo");
    }

    public static void createPwd(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Low password");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Big password");
        }
        System.out.println("Password - ok!");
    }
}


class Samolet{
    String sostoyanie = "v ojidanii"; //v ojidanii, v vozduhe, polet otmenen
    public void fly(){
        sostoyanie = "v vozduhe";
        System.out.println("Samolet letit");
    }
    public void waite(){
        if (sostoyanie.equals("v vozduhe")){
            throw new IllegalStateException("Samolet uge v vozduhe");}
            sostoyanie = "v ojidanii";
        System.out.println("Samolet v ojidanii poleta");


    }
}

