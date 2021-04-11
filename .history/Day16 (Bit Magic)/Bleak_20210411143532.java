public class Bleak {
    // *** https://www.geeksforgeeks.org/check-if-a-number-is-bleak/

    public static boolean check(int num) {

        int si = (int) Math.ceil(Math.log(num) / Math.log(2));

        for (int i = 1; i <= len; i++) {

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
        System.out.println(check(4));
    }

}
