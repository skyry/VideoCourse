package HomeWork.Lessons16;

public class Mail1 {
    public void email(String e) {
        int a = 0; // позиция символа @
        int b = 0; // позиция символа .
        int c = 0; // позиция символа ;
        while (c < e.length() - 1){

            a = e.indexOf('@', c);
            b = e.indexOf('.',c);
            c= e.indexOf(';',c);
            System.out.println(e.substring((a+1),b));
        }

        }

    public static void main(String[] args) {
        Mail mail1 = new Mail();
        mail1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }

}
