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
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr)
            set.add(ele);
        System.out.println(set);

        for (int i = 0; i < set.size(); i++) {

            for (int j = i + 1; j < set.size(); j++) {

            }
        }

    }
}
