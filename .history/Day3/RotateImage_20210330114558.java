public class RotateImage {
    public static void main(String[] args) {

    }

    public static void fun(int[][] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int val = arr[i][j];
                arr[i][j] = arr[j][n - 1 - i];
                arr[j][n - 1 - i] = arr[n - 1 - i][n - 1 - j];
                arr[n - 1 - i][n - 1 - j] = arr[n - 1 - i][0];
                arr[n - 1 - i][0] = val;
            }

        }

    }

}
