package Lesson21;

//Превращение конструктора в метод путем добавления к нему return type
public class Test3 {
    void Test3 (){
        System.out.println("Create Object");
    }
    public static void main(String[] args) {
     Test3 test = new Test3();
    }
}
