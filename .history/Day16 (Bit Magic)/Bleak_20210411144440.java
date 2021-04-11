public class Bleak {
    // *** https://www.geeksforgeeks.org/check-if-a-number-is-bleak/

    public static boolean check(int num) {
        for (int i = num - len(num); i < num; i++)
            if (countBits(i) + i == num)
                return false;
        return true;
    }

    public static int len(int n) {
        int num = n - 1;
        int count = 0;
        while (num != 0) {
            count++;
            num >>= 1;
        }
        return count;
    }

    public static int countBits(int n) {
        int num = n;
        int count = 0;
        while (num != 0) {
            count++;
            num &= (num - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(check(3));
    }

}
