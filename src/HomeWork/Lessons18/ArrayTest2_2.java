package HomeWork.Lessons18;

public class ArrayTest2_2 {
    public static void showArray1(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }

        }
        System.out.print(" }");
    }


    //System.out.print("{ {" + array[0][0] + ", " + array[0][1] + "}, {" + array[1][0] + "}, {" + array[1][0] + ", " + array[1][1] + "} }");

    public static void main(String[] args) {
        String[][] array = {{"Privet", "Poka"}, {"Hi", "Hiiii"}, {"Hello", "World"}};
        showArray1(array);
    }
}
