public class TwoDSorting {

    public static void main(String[] args) {

    }

    public static void fun(int[][] arr) {

        Arrays.sort(arr, (int[] a, int[] b) -> {
            if (a[2] != b[2])
                return a[2] - b[2];
            else if (a[1] != b[1])
                return a[1] - b[1];
            else
                return a[0] - b[0];
        });

    }

}
