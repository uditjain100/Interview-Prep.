public class maxSubarraySumCircular {

    public static void main(String[] args) {

    }

    public int maxSubarraySumCircular(int[] arr) {
        int sum = 0;
        int curr_min_sum = 0;
        int curr_max_sum = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
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
