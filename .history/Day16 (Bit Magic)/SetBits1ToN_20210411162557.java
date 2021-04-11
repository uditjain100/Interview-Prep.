public class SetBits1ToN {
    
    public static int count(int num) {

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
