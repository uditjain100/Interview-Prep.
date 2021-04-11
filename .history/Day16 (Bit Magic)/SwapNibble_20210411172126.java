public class SwapNibble {

    public static int swap(int num) {

        if (num > 255)
            return num;

        return ((15 & num) << 4) | ((240 & num) >> 4);
    }

    public static void main(String[] args) {
        System.out.println(swap(233));
    }

}
