package Lesson21;

//При вызове метода, требующего в параметр тип данных int мы можем использовать тип данных char
public class Test5 {
    void abc(int i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char c = 'a';
        t.abc(c);
    }
}
