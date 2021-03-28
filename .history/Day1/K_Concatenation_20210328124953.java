import java.util.Scanner;

public class K_Concatenation {

    // You are given an array A with size N (indexed from 0) and an integer K. Let's
    // define another array B with size N · K as the array that's formed by
    // concatenating K copies of array A.

    // For example, if A = {1, 2} and K = 3, then B = {1, 2, 1, 2, 1, 2}.

    // You have to find the maximum subarray sum of the array B. Fomally, you should
    // compute the maximum value of Bi + Bi+1 + Bi+2 + ... + Bj, where 0 ≤ i ≤ j < N
    // · K.

    // Input
    // The first line of the input contains a single integer T denoting the number
    // of test cases. The description of T test cases follows.
    // The first line of each test case contains two space-separated integers N and
    // K.
    // The second line contains N space-separated integers A0, A1, ..., AN-1.
    // Output
    // For each test case, print a single line containing the maximum subarray sum
    // of B.

    public static void main(String[] args) {

        int ans = KadanesAlgo_Linear(new int[] { 0, -1, 5, -3, 5, 1 });
        System.out.println(ans);

        // Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();
        // for (int i = 0; i < t; i++) {
        // int n = scn.nextInt();
        // int k = scn.nextInt();
        // int[] arr = new int[n];
        // for (int j = 0; j < n; j++)
        // arr[j] = scn.nextInt();
        // int ans = fun(arr, k);
        // System.out.println(ans);
        // }
    }
    // *** Based on KADANE's Algorithm

    public static int fun(int[] arr, int k) {
        if (arr.length <= 0 || k <= 0)
            return 0;

        boolean neg = false;
        boolean pos = false;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            sum += ele;
            if (ele < 0)
                neg = true;
            else
                pos = true;
            min = Math.min(ele, min);
        }
        if (!neg)
            return sum * k;
        if (!pos)
            return min;

        if (k == 1)
            return KadanesAlgo_Linear(arr);
        if (sum < 0)
            return KadanesAlgo_Circular(arr);
        return KadanesAlgo_Circular(arr) + (k - 2) * sum;
    }

    public static int KadanesAlgo_Linear(int[] arr) {
        int curr_max_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int ele : arr) {
            curr_max_sum = Math.max(ele, ele + curr_max_sum);
            max_sum = Math.max(curr_max_sum, max_sum);
        }
        return max_sum;
    }

    public static int KadanesAlgo_Circular(int[] arr) {
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
