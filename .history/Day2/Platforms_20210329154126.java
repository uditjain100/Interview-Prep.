import java.util.Arrays;

public class Platforms {

    // Minimum Number of Platforms Required for a Railway/Bus Station
    // Difficulty Level : Medium
    // Last Updated : 08 Feb, 2021
    // Given arrival and departure times of all trains that reach a railway station,
    // the task is to find the minimum number of platforms required for the railway
    // station so that no train waits.
    // We are given two arrays which represent arrival and departure times of trains
    // that stop.

    public static void main(String[] args) {

        int a[] = { 900, 940 };
        int d[] = { 910, 1200 };

        int[][] arr = new int[a.length][2];
        for (int i = 0; i < a.length; i++) {
            arr[i][0] = a[i];
            arr[i][1] = d[i];
        }
        int ans = fun(arr);
        System.out.println(ans);
    }

    public static int fun(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            return a[0] - b[0];
        });

        int curr = 1;
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][1] < arr[j][0])
                    break;
                curr++;
            }
            max = Math.max(max, curr);
            curr = 1;
        }
        return max;
    }

}
