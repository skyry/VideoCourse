package Lesson21;

//Параметры в overloaded методах могут быть как примитивного, так и ссылочного типа данных

public class Test4 {
    public void abc(String s){
        System.out.println(s);
    }

    public void abc(boolean b){
        System.out.println(b);
    }

    private StringBuilder abc (StringBuilder sb){
        System.out.println(sb);
        return new StringBuilder("Bye");
    }
}
