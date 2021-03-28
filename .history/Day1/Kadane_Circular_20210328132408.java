public class Kadane_Circular {
    public static void main(String[] args) {

        int[] arr = { 0, -1, 5, -3, 5, 1 };
        System.out.println(KadanesAlgo_Circular(arr));

    }

    public static long KadanesAlgo_Circular(int[] arr) {
        long sum = 0;
        long curr_min_sum = 0;
        long curr_max_sum = 0;
        long min_sum = Integer.MAX_VALUE;
        long max_sum = Integer.MIN_VALUE;
        for (int ele : arr) {
            sum += ele;
            curr_max_sum = Math.max(ele, ele + curr_max_sum);
            curr_min_sum = Math.min(ele, ele + curr_min_sum);
            max_sum = Math.max(curr_max_sum, max_sum);
            min_sum = Math.min(curr_min_sum, min_sum);
        }
        if (max_sum >= 0)
            return Math.max(max_sum, sum - min_sum);
        else
            return max_sum;
    }
}
