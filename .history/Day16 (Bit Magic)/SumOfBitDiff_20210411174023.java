public class SumOfBitDiff {

    public static int sum(int[] arr) {

        int res = 0;
        for (int i = 0; i < 32; i++) {
            int mask = (1 >> 1);
            int count = 0;
            for (int ele : arr)
                count += (ele & mask);
            res += count * (arr.length - count);
        }
        return res;

    }

}
