public class TwoDSorting {

    public static void main(String[] args) {
        int dates[][] = { { 20, 1, 2014 }, { 25, 3, 2010 }, { 3, 12, 2000 }, { 18, 11, 2000 }, { 19, 4, 2015 },
                { 9, 7, 2005 } };
        fun(dates);
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
