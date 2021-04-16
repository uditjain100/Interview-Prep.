import java.util.PriorityQueue;

public class slidingWindowMax {

    public static void fun(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });

        for (int i = 0; i < arr.length && i < k; i++) {

        }

    }

}