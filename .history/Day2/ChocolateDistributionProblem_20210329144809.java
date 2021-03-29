import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {

    }

    public static int fun(int[] arr, int m) {

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - m; i++)
            min = Math.min(min, arr[i + m] - arr[i]);
        return min;
    }

}
