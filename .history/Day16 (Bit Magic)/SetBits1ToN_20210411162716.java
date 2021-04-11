public class SetBits1ToN {

    public static int count(int num) {

        if (num == 0)
            return 0;
        if (num == 1 || num == 2)
            return 1;

    }

    public static int pot(int num) {
        int count = 0;
        int n = 1;
        while (num <= n) {
            count++;
            n <<= 1;
        }
        return count;
    }

}
