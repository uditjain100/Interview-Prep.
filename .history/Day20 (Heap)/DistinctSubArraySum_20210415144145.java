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

    public static void main(String[] args) {
        fun(new int[] { 1, 2, 3 });
    }

}
