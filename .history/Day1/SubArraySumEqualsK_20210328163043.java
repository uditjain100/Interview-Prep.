import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {

    }

    public static int fun(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0;
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
            map.putIfAbsent(sum, 0);
            map.put(sum, map.get(sum) + 1);
            if (map.containsKey(sum - k))
                res += map.get(sum) * map.get(sum - k);
        }
        return res;
    }

}
