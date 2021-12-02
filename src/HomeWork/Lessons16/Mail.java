package HomeWork.Lessons16;


public class Mail {

    public void email(String text){
        String t = text;
        int c1 = 0;
        int c2 = 0;
        char c3 = ' ';

        for (int i = 0; i<t.length(); i++){
            if (t.charAt(i) == '@'){
                System.out.print(t.charAt(i+1));
                    }
            if (t.charAt(i) != '.'){
                System.out.print(t.charAt(i));
            }

            else {
                System.out.println();
            }


            }

        }


    public static void main(String[] args) {
        Mail mail1 = new Mail();
        mail1.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }



}
