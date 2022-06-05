package JR;

public class Artifact {
    int number;
    String cult;
    int age;

    Artifact(int number){
        this.number = number;
    }
    Artifact(int number, String cult){
        this.number = number;
        this.cult = cult;
    }
    Artifact(int number, String cult, int age){
        this.number = number;
        this.cult = cult;
        this.age = age;
    }


    public static void main(String[] args) {
        Artifact a1 = new Artifact(212121);
        Artifact a2 = new Artifact(212121,"Acteki");
        Artifact a3 = new Artifact(212121,"Acteki",12);

        System.out.println("Number: " + a1.number);
        System.out.println("Number: " + a2.number+" Cult: "+a2.cult);
        System.out.println("Number: " + a3.number+" Cult: "+a3.cult+" Age: "+a3.age);
    }
}
