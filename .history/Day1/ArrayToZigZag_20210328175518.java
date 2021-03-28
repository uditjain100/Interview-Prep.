public class ArrayToZigZag {
    public static void main(String[] args) {

    }

    public static void fun(int[] arr) {

        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++)
            left[i] = left[i - 1] + arr[i];
        for (int i = 1; i < n; i++)
            left[i] = left[i - 1] + arr[i];

    }
}
