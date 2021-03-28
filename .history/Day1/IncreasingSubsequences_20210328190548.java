import java.util.ArrayList;

public class IncreasingSubsequences {
    public static void main(String[] args) {
        fun(new int[] { 4, 6, 7, 7 });
    }

    public static void fun(int[] arr) {

        ArrayList<ArrayList<Integer>>[] dp = new ArrayList[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = new ArrayList<>();
            dp[i].add(new ArrayList<>());
            dp[i].get(0).add(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    for (int k = 0; k < dp[j].size(); k++) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.addAll(dp[j].get(k));
                        list.add(arr[i]);
                        dp[i].add(list);
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(dp[i]);

    }

}
