import java.util.ArrayList;
import java.util.PriorityQueue;

public class slidingWindowMax {

    public static void fun(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length && i < k; i++)
            pq.add(arr[i]);
        res.add(pq.peek());
        for (int i = 0; i < arr.length - k; i++) {
            pq.remove(arr[i]);
            pq.add(arr[i + k]);
            res.add(pq.peek());
        }
        System.out.println(res);
    }

}