package Lesson21;

//Некоторые моменты, связанные с ключевым словом return
public class Test6 {
    int abc() {
        return 5;
    }

    int abc (int i){
        if(i<5){return 100;}
        else {return 200;}
    }

    public static void main(String[] args) {
        int a = new Test6().abc();
        System.out.println(new Test6().abc(0));
    }
}
