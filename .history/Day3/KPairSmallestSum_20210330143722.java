import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class KPairSmallestSum {

    public class Pair {
        int a;
        int b;
        int sum;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
            this.sum = this.a + this.b;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 11 };
        int arr2[] = { 2, 4, 8 };

        fun(arr1, arr2, 3);
    }

    public static void fun(int[] arr1, int[] arr2, int k) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            return a.sum - b.sum;
        });

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

            }
        }

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
