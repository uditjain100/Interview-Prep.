public class TwoNonRepeatingEle {

    public static void find(int[] arr) {

        int xor = arr[0];
        for (int i = 1; i < arr.length; i++)
            xor ^= arr[i];

        int count = 1;
        while (xor != 0) {
            if ((xor & 1) == 1)
                break;
            xor >>= 1;
            count++;
        }

    }

}
