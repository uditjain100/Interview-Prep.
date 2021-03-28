public class LIS {
    public static void main(String[] args) {

    }

    public static int fun(int[] arr) {

        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j])
                    max = Math.max(max, aar[j]);
            }
            arr[i] = max + 1;
        }

    }

}
