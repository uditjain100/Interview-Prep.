public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        fun(arr);
        for (int[] a : arr) {
            for (int ele : a)
                System.out.print(ele + ", ");
            System.out.println();
        }
    }

    public static void fun(int[][] arr) {

        int n = arr.length;

        for (int i = 0; i < 1; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(arr[i][j] + ", " + arr[j][n - 1 - i] + ", " + arr[n - 1 - i][n - 1 - j] + ", "
                        + arr[n - 1 - j][0]);
                int val = arr[i][j];
                arr[i][j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[n - 1 - j][0];
                arr[n - 1 - j][0] = val;
            }

        }

    }
}
