import java.util.ArrayList;
import java.util.List;

public class IncreasingSubsequences {
    public static void main(String[] args) {
        System.out.println(fun(new int[] { 4, 6, 7, 7 }));
    }

    public static List<List<Integer>> fun(int[] arr) {

        ArrayList<ArrayList<Integer>>[] dp = new ArrayList[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dp[i] = new ArrayList<>();
            dp[i].add(new ArrayList<>());
            dp[i].get(0).add(arr[i]);
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] <= arr[i]) {
                    for (int k = 0; k < dp[j].size(); k++) {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.addAll(dp[j].get(k));
                        list.add(arr[i]);
                        dp[i].add(list);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < dp[i].size(); j++) {
                if (dp[i].get(j).size() > 1) {
                    boolean temp = false;
                    for (List<Integer> l : res)
                        if (dp[i].get(j).equals(l))
                            temp = true;
                    if (!temp)
                        res.add(dp[i].get(j));
                }

            }
        }
        return res;
    }

}
