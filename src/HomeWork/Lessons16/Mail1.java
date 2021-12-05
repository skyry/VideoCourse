package HomeWork.Lessons16;

class Mail1 {
    public void email1(String e) {
        int a = 0; // позиция символа @
        int b = 0; // позиция символа .
        int c = 0; // позиция символа ;
        while (c < e.length() - 1) {

            a = e.indexOf('@', c);
            b = e.indexOf('.', c);
            c = e.indexOf(';', c + 1);
            System.out.println(e.substring(a + 1, b));
        }

    }

    public static void main(String[] args) {
        Mail1 mail1 = new Mail1();
        mail1.email1("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }

}
