public class SwapNibble {

    public static int swap(int num) {

        System.out.println(Integer.toBinaryString(num));

        if (num > 255)
            return num;

        int num1 = 15;
        int num2 = 240;

        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));

        num1 &= num;
        num2 &= num;

        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));

        return num;
    }

    public static void main(String[] args) {
        System.out.println(swap(125));
    }

}
