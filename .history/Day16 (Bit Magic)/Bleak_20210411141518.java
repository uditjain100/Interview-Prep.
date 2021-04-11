public class Bleak {
    // *** https://www.geeksforgeeks.org/check-if-a-number-is-bleak/

    public static boolean check(int num) {

        int temp = num;
        int len = len(temp);
        temp = num;

        int leftMask = 1;
        int rightMask = Integer.MAX_VALUE - 1;

        for (int i = 1; i < len; i++) {
            int n = num & leftMask;
            int cb = num & rightMask;
            System.err.println(n);
            if (countBits(n) == cb)
                return false;
            leftMask |= (1 << i);
            rightMask ^= (1 << i);
        }
        return true;
    }

    public static int len(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num >>= 1;
        }
        return count;
    }

    public static int countBits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num &= (num - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(check(9));
    }

}
