import java.util.HashSet;

public class DistinctSubArraySum {

    public static void fun(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                res += ((len + 1) * (len + 2)) / 2;
                while (arr[i - len] != arr[i]) {
                    set.remove(arr[i - len]);
                    len--;
                }
            } else {
                set.add(arr[i]);
                len++;
            }
        }
        res += ((len + 1) * (len + 2)) / 2;
        System.out.println(res);
    }

    public static void coinChange(int[] arr, int idx, int target, int ans, int count) {

        if (idx == arr.length || count == arr.length / 2) {
            System.out.println(ans);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            coinChange(arr, i + 1, ans);
            coinChange(arr, i + 1, ans + arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        fun(new int[] { 1, 2, 3, 4, 4, 5, 3, 6, 7 });
        coinChange(new int[] { 1, 3, 5, 7 }, 0, "");
    }

}
