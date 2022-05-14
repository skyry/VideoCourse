package HomeWork.Lessons18;

public class ArrayTest2 {
    public static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            //System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 & j == 0) {
                    System.out.print("{" + array[i][j] + ", ");
                }
                if (i == 0 & j == 1) {
                    System.out.print(array[i][j] + "}, ");
                }
                if (i == 1 & j == 0) {
                    System.out.print("{" + array[i][j] + "} ");
                    System.out.print("{" + array[i][j] + ", ");
                }
                if (i == 1 & j == 1) {
                    System.out.print(array[i][j] + "} }");
                    break;
                }


            }
        }
    }

    //System.out.print("{ {" + array[0][0] + ", " + array[0][1] + "}, {" + array[1][0] + "}, {" + array[1][0] + ", " + array[1][1] + "} }");

    public static void main(String[] args) {
        String[][] array = {{"Privet", "Poka"}, {"Hi", "Hiiii"}, {"Hello", "World"}};
        showArray(array);
    }
}
