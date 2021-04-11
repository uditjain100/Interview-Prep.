public class SumOfBitDiff {

    // *** https://www.geeksforgeeks.org/sum-of-bit-differences-among-all-pairs/

    public static int sum(int[] arr) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            int count = 0;
            for (int ele : arr)
                count += (ele & mask);
            System.out.println(count);
            res += (count * (arr.length - count));
        }
        return res * 2;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] { 1, 3, 5 }));
    }

}
