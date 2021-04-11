public class reverse {

    public static int reverseNumber(int num) {

        int r_num = 0;
        while (num != 0) {
            r_num *= 10;
            r_num += (num & 1);
            num >>= 1;
        }
        return r_num;
    }

}
