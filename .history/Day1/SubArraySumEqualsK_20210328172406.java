import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {

    }

    public static int fun(int[] arr, int k) {
        if (k == 0)
            return subarrayssumequalzero(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0;
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
            map.putIfAbsent(sum, 0);
            map.put(sum, map.get(sum) + 1);
        }
        for (int ele : map.keySet()) {
            if (map.containsKey(ele - k)) {
                res += map.get(ele) * map.get(ele - k);
            }
        }
        return res;
    }

    public static int subarrayssumequalzero(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
            map.putIfAbsent(sum, 0);
            map.put(sum, map.get(sum) + 1);
        }
        for (int ele : map.keySet()) {
            int val = map.get(ele);
            if (val != 1)
                res += val * (val - 1) / 2;
        }
        if (map.containsKey(0))
            res += map.get(0);
        return res;
    }

}
