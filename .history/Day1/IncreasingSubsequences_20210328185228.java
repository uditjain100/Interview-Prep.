import java.util.ArrayList;

public class IncreasingSubsequences {
    public static void main(String[] args) {

        fun(new int[] { 4, 6, 7, 7 });

    }

    public static void fun(int[] arr) {

        ArrayList<ArrayList<Integer>>[] dp = new ArrayList[arr.length];
        dp[0] = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {

                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(dp[i]);

    }

}
