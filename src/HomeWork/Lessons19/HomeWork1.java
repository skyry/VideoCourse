package HomeWork.Lessons19;

public class HomeWork1 {
    public static String[] abc(String[]... array1) {
        int lenght = 0;
        for (String[] array2 : array1) {
            lenght += array2.length;
        }
        String[] target = new String[lenght];
        int count = 0;
        for (String[] array2 : array1) {
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }


    public static void main(String[] args) {
        String[] s1 = new String[]{"1", "2", "3", "4", "5"};
        String[] s2 = new String[]{"6", "7", "8", "9", "10"};
        String[] s3 = new String[]{"11", "12", "13", "14", "15"};
        String[] s4 = new String[]{"16", "17", "18", "19", "20"};

        String[] target = abc(s1, s2, s3, s4);
        //String[] target = abc(new String[]{"1", "2", "3", "4", "5"}, new String[]{"6", "7", "8", "9", "10"});
        for (String s : args) {
            for (int i = 0; i <target.length; i++) {
                if (s.equals(target[i])) {
                    target[i] = null;
                }
            }

        }
        for (String j : target) {
            System.out.print(j + " ");
        }


    }
}
