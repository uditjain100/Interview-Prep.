public class SetBits1ToN {

    public static int countBits(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        int pow = pot(num);
        int res = (int) Math.pow(2, pow - 1);
        return (pow * res) + (num - (res * 2) + 1) + countBits(num - (res * 2));
    }

    public static int pot(int num) {
        int count = 0;
        int n = 1;
        while (n <= num) {
            count++;
            n <<= 1;
        }
        return count - 1;
    }

    public static void main(String[] args) {
        System.out.println(countBits(3));
    }

}
