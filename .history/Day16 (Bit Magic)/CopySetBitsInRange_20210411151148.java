public class CopySetBitsInRange {

    // *** https://www.geeksforgeeks.org/copy-set-bits-in-a-range/

    public static void filter(int a, int b, int l, int r) {
        int mask = 0;
        for (int i = l - 1; i < r; i++)
            mask |= (1 << i);
        b |= (a & mask);
    }

    public static void main(String[] args) {
        filter(10, 15, 2, 3);
    }

}
