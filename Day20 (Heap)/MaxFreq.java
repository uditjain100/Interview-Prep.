public class MaxFreq {

    public static void fun(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++)
            arr[arr[i] % k] += k;
        int max = -1;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }

    public static void main(String[] args) {
        fun(new int[] { 2, 3, 3, 5, 3, 4, 1, 7 }, 8);
    }

}
