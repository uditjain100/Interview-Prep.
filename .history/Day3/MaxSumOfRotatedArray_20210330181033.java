public class MaxSumOfRotatedArray {

    // Maximum sum of i*arr[i] among all rotations of a given array

    public static void main(String[] args) {

    }

    public static void fun(int[] arr) {

        int sum = 0;
        for (int ele : arr)
            sum += ele;

        int res = 0;
        for (int i = 0; i < arr.length; i++)
            res += i * arr[i];
        int max = res;

        for (int i = 0; i < arr.length - 1; i++) {
            res = res + sum - (arr[arr.length - 1 - i] * arr.length);
        }

    }

}
