import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {

        int ans = fun(new int[] { 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 }, 7);
        System.out.println("Minimum Difference is " + ans);

    }

    public static int fun(int[] arr, int m) {
        Arrays.sort(arr);
        for (int ele : arr)
            System.out.print(ele + ", ");
        System.out.println();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - m; i++)
            min = Math.min(min, arr[i + m - 1] - arr[i]);
        return min;
    }

}
