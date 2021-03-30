import java.util.ArrayList;
import java.util.List;

public class KPairSmallestSum {
    public static void main(String[] args) {

    }

    public static void fun(int[] arr1, int[] arr2, int k) {

        List<List<Integer>> res = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length && k > 0) {
            if (arr1[i] < arr2[j]) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr1[i]);
                list.add(arr2[j++]);
                res.add(list);
                k--;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr1[i++]);
                list.add(arr2[j]);
                res.add(list);
                k--;
            }

        }

    }
}
