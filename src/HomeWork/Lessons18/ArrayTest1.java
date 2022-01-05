package HomeWork.Lessons18;

public class ArrayTest1 {
    public static int[] sortirovka1(int[] array) {
        //Arrays.sort(array);
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j=i+1; j<array.length;j++){
                if (array[j]<min){
                    min=array[j];
                    index = j;
                }
            }

            if (i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
        sortirovka1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

}

