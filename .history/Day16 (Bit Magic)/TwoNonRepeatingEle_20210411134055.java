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
        int maxk = 1 >> count;

        int f = -1;
        int s = -1;

        for (int ele : arr) {
            if ((ele & mask) == 0)
                if (f == -1)
                    f = ele;
                else
                    f ^= ele;
            else if (s == -1)
                s = ele;
            else
                s ^= ele;
        }
    }

}
