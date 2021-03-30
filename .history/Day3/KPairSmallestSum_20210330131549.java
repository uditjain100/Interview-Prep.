import java.util.ArrayList;
import java.util.List;

public class KPairSmallestSum {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 11 };
        int arr2[] = { 2, 4, 8 };

        fun(arr1, arr2, 3);
    }

    public static void fun(int[] arr1, int[] arr2, int k) {
        List<List<Integer>> res = new ArrayList<>();

        int ii = 0, ij = 0;
        int ji = 0, jj = 0;
        while (ii < arr1.length && ij < arr2.length && ii < arr1.length && ij < arr2.length && k > 0) {
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
        System.out.println(res);
    }
}
