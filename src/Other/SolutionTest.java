package Other;

import java.util.ArrayList;

public class SolutionTest {
    public static void main(String[] args) {

        System.out.println(Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
    }
}
 class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if (a[j] != b[i]){
                    list.add(a[j]);
                }
            }
        }
        return a;
    }

}
