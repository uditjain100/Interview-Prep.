public class CopySetBitsInRange {

    // *** https://www.geeksforgeeks.org/copy-set-bits-in-a-range/

    public static void filter(int a, int b, int l, int r) {

        int mask = 0;
        for (int i = l; i <= r; i++) {
            int m = (1 >> i);
            mask |= m;
        }
        System.out.println(Integer.toBinaryString(mask));

    }

    public static void main(String[] args) {
        filter(0, 0, 4, 9);
    }

}
