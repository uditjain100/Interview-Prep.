import java.util.HashSet;

public class MaxXOR {

    public static int find(int[] arr) {
        int res = 0;
        int mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            HashSet<Integer> set = new HashSet<>();
            for (int ele : arr)
                set.add(ele & mask);
            int temp = res | (1 << i);
            for (int ele : set) {
                if (set.contains(ele ^ temp)) {
                    res = temp;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
