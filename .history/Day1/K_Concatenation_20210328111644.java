
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

    }

    // *** Based on KADANE's Algorithm

    public static void fun(int[] arr, int k) {

        boolean neg = false;
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
            if (ele < 0)
                neg = true;
        }
        if (!neg)
            return sum * k;

        int c_sum = 0;
        int m_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            c_sum += arr[i];
            m_sum = Math.max(c_sum, m_sum);
            if (c_sum < 0)
                c_sum = 0;
        }
        m_sum = Math.max(m_sum,sum - m_sum )
        return m_sum;
    }

}
