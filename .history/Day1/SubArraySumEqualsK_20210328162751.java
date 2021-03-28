import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {

    }

    public static void fun(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int ele : arr) {
            sum += ele;
            map.putIfAbsent(sum, 0);
            map.put(sum, map.get(sum) + 1);

        }

    }

}
