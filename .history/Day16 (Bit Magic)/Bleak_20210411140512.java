public class Bleak {
    // *** https://www.geeksforgeeks.org/check-if-a-number-is-bleak/

    public static boolean check(int num) {

        int temp = num;
        int len = len(temp);

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

}
