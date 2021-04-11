public class SwapNibble {

    public static byte swap(byte num) {

        if (num > 255)
            return num;

        System.out.println(Integer.toBinaryString(Byte.MAX_VALUE));

        // byte num1 = 15;
        // byte num2 = 240;
        // num1 &= num;
        // num2 &= num;
        return num;
    }

    public static void main(String[] args) {
        System.out.println((int) swap((byte) 18));
    }

}
