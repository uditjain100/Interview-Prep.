public class SwapNibble {

    public static int swap(int num) {

        System.out.println(Integer.toBinaryString(num));

        if (num > 255)
            return num;

        int num1 = 15 & num;
        int num2 = 240 & num;

        num1 <<= 4;
        num2 >>= 4;

        return num;
    }

    public static void main(String[] args) {
        System.out.println(swap(233));
    }

}
