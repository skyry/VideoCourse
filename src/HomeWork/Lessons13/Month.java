package HomeWork.Lessons13;

public class Month {

    public static void monthDay(int a) {
        switch (a) {
            case 1:
                System.out.println("Январь - 31 день");
                break;
            case 2:
                System.out.println("Февраль - 28 день");
                break;
            case 3:
                System.out.println("Март - 31 день");
                break;
            case 4:
                System.out.println("Апрель - 30 день");
                break;
            case 5:
                System.out.println("Май - 31 день");
                break;
            case 6:
                System.out.println("Июнь - 31 день");
                break;
            case 7:
                System.out.println("Июль - 31 день");
                break;
            case 8:
                System.out.println("Август - 31 день");
                break;
            case 9:
                System.out.println("Сентябрь - 31 день");
                break;
            case 10:
                System.out.println("Октябрь - 31 день");
                break;
            case 11:
                System.out.println("Ноябрь - 31 день");
                break;
            case 12:
                System.out.println("Декабрь - 31 день");
        }
    }

    public static void main(String[] args) {
        Month.monthDay(11);
    }
}
