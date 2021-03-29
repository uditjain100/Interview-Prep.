import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairsDiffK {
    public static void main(String[] args) {

        int ans = fun(new int[] { 1, 3, 5, 6, 1, 2, 4, 5, 3, 6, 2, 1, 4, 5, 2, 9 }, 0);
        System.out.println(ans);
    }

    public static int fun(int[] arr, int k) {

        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr)
            set.add(ele);
        System.out.println(set);
        int res = 0;
        for (int ele : set)
            if (set.contains(ele + k))
                res++;
        return res;
    }
}
