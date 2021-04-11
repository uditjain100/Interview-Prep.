public class CopySetBitsInRange {

    // *** https://www.geeksforgeeks.org/copy-set-bits-in-a-range/

    public static void filter(int a, int b, int l, int r) {
        int mask = 0;
        for (int i = l - 1; i < r; i++)
            mask |= (1 << i);
        a |= (b & mask);
        System.out.println(b);
    }

    public static void main(String[] args) {
        filter(10, 13, 2, 3);
    }

}
