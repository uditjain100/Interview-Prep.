public class Kadane_Linear {
    public static void main(String[] args) {

    }

    public static long KadanesAlgo_Linear(int[] arr) {
        long curr_max_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        for (int ele : arr) {
            curr_max_sum = Math.max(ele, ele + curr_max_sum);
            max_sum = Math.max(curr_max_sum, max_sum);
        }
        return max_sum;
    }
}
