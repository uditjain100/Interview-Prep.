public class MaxFreq {
    public static void fun(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[arr[i] % k] += k;
        }

    }

}
