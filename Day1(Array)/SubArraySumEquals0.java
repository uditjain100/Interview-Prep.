import java.util.HashMap;

public class SubArraySumEquals0 {
    public static void main(String[] args) {

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
