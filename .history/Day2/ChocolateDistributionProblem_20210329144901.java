import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {

        int ans = fun(new int[] { 7, 3, 2, 4, 9, 12, 56 }, 3);
        System.out.println(ans);

    }

    public static int fun(int[] arr, int m) {

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - m; i++)
            min = Math.min(min, arr[i + m] - arr[i]);
        return min;
    }

}
