public class reverse {
    public static int reverseNumber(int num) {
        int count = 0;
        int r_num = 0;
        while (num != 0) {
            r_num *= 10;
            r_num += (num & 1);
            num >>= 1;
            count++;
        }

        while (count++ != 32)
            r_num <<= 1;
        System.out.println(r_num);
        return r_num;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(reverseNumber(2)));
    }

}
