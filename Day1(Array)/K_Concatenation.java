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
        int[] arr = { 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000, 10000 };
        System.out.println(fun(arr, 100000));
    }
    // *** Based on KADANE's Algorithm

    public static final int mod = (int) 1000000007;

    public static int fun(int[] arr, int k) {
        if (arr.length <= 0 || k <= 0)
            return 0;

        boolean neg = false;
        long sum = 0;
        for (int ele : arr) {
            sum += ele;
            if (ele < 0)
                neg = true;
        }
        if (!neg)
            return 0;

        if (k == 1)
            return KadanesAlgo_Linear(arr);
        if (sum < 0)
            return KadanesAlgo_TwoArray(arr);
        int res = KadanesAlgo_TwoArray(arr);
        int r = (int) ((k - 2) * sum) % mod;
        return (res + r) % mod;
    }

    public static int KadanesAlgo_Linear(int[] arr) {
        long curr_max_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        for (int ele : arr) {
            curr_max_sum = Math.max(ele, ele + curr_max_sum);
            max_sum = Math.max(curr_max_sum, max_sum);
        }
        return (int) (max_sum % mod);
    }

    // ** This is not a circular Kadane's Algo

    public static int KadanesAlgo_TwoArray(int[] arr) {
        long curr_max_sum = 0;
        long max_sum = Integer.MIN_VALUE;
        for (int ele : arr) {
            curr_max_sum = Math.max(ele, ele + curr_max_sum);
            max_sum = Math.max(curr_max_sum, max_sum);
        }
        for (int ele : arr) {
            curr_max_sum = Math.max(ele, ele + curr_max_sum);
            max_sum = Math.max(curr_max_sum, max_sum);
        }
        return (int) (max_sum % mod);
    }

    // ** Next : 1262. Greatest Sum Divisible by Three

}
