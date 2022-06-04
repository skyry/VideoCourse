package Lessons26;

public class Test3 {
    void abc (int i){
        System.out.println("int");
    }
    void abc (byte i){
        System.out.println("byte");
    }
    void abc (long i){
        System.out.println("long");
    }

    void def (Object obj){
        System.out.println("Object");
    }
    void def (String obj){
        System.out.println("String");
    }


    void ghi (int a, int b){
        System.out.println("int");
    }
    void ghi (long a, long b){
        System.out.println("long");
    }
    void ghi (Integer a, Integer b){
        System.out.println("Integer");
    }
    void ghi (int...a){
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
        t.def("Hello");
        t.ghi(1,2);

    }
}
