public class Bleak {
    // *** https://www.geeksforgeeks.org/check-if-a-number-is-bleak/

    public static boolean check(int num) {

        int temp = num;
        int len = len(temp);
        temp = num;

        int leftMask = 0;
        int rightMask = Integer.MAX_VALUE;
        System.out.println(leftMask);
        System.out.println(rightMask);

        for (int i = 1; i < len; i++) {
            leftMask <<= 1;
            rightMask >>= 1;
            int n = num & leftMask;
            int cb = num & rightMask;
            if (countBits(n) == cb)
                return false;
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
