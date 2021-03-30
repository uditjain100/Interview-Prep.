import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class KPairSmallestSum {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 11 };
        int arr2[] = { 2, 4, 8 };

        fun(arr1, arr2, 3);
    }

    public static void fun(int[] arr1, int[] arr2, int k) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int ii = 0, ij = 0;
        int ji = 0, jj = 0;
        while (ii < n1 && ij < n2 && ji < n1 && jj < n2 && k > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            if (arr1[ii] + arr2[ij] > arr1[ji] + arr2[jj]) {

            } else {

            }
        }
        System.out.println(res);
    }
}

// ArrayList<Integer> list = new ArrayList<>();
// if (arr1[ii] + arr2[ij] > arr1[ji] + arr2[jj]) {
// list.add(arr1[ji++]);
// list.add(arr2[jj++]);
// } else {
// list.add(arr1[ii++]);
// list.add(arr2[ij++]);
// }
// res.add(list);
// k--;
