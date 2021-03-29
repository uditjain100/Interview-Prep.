import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PairsDiffK {
    public static void main(String[] args) {

        fun(new int[] { 1, 3, 5, 6, 1, 2, 4, 5, 3, 6, 2, 1, 4, 5, 2, 9 }, 0);

    }

    public static void fun(int[] arr, int k) {

        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.putIfAbsent(ele, 0);
            map.put(ele, map.get(ele) + 1);
        }
        System.out.println(map);
        int res = 0;
        for (int ele : map.keySet()) {
            if (map.get(ele) == 0)
                continue;
            if (map.containsKey(ele + k) && map.get(ele + k) != 0) {
                res++;
                map.put(ele, map.get(ele) - 1);
                map.put(ele + k, map.get(ele + k) - 1);
            }
            if (map.containsKey(ele + k) && map.get(ele + k) != 0) {
                res++;
                map.put(ele, map.get(ele) - 1);
                map.put(ele + k, map.get(ele + k) - 1);
            }
        }

    }
}
