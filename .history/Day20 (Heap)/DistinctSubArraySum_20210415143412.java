import java.util.HashSet;

public class DistinctSubArraySum {

    public static void fun(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int res = 1;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                res += ((len + 1) * (len + 2)) / 2;
            } else {
                set.add(arr[i]);
                len++;
            }
        }

    }

}
