package HomeWork.Lessons16;


public class Mail {

    public void email(String text) {
        String t = text;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) == '@') {
                c1 = (t.indexOf('@', i)) + 1;
            }
            if (t.charAt(i) == '.') {
                c2 = t.indexOf('.', i);
                System.out.println(t.substring(c1, c2));
            }
        }
    }


    public static void main(String[] args) {
        Mail mail1 = new Mail();
        mail1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }


}
