package HomeWork.Lessons16;


public class Mail {

    public void email(String e) {
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < e.length(); i++) {

            if (e.charAt(i) == '@') {
                c1 = (e.indexOf('@', i)) + 1;
            }
            if (e.charAt(i) == '.') {
                c2 = e.indexOf('.', i);
                System.out.println(e.substring(c1, c2));
            }
        }
    }

    public static void main(String[] args) {
        Mail mail1 = new Mail();
        mail1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }


}
