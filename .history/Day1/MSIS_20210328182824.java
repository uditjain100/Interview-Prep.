public class MSIS {

    // ***** public static int fun(int[] arr) {
    int[] dp = new int[arr.length];dp[0]=1;for(
    int i = 1;i<arr.length;i++)
    {
        int sum = 0;
        for (int j = 0; j < i; j++) {
            if (arr[i] > arr[j])
                sum = Math.max(sum, dp[j]);
        }
        dp[i] = sum + arr[i];
    }
    int res = 0;for(
    int ele:dp)res=Math.max(ele,res);return res;
    }

    public static void main(String[] args) {

    }

    public static int fun(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j])
                    sum = Math.max(sum, dp[j]);
            }
            dp[i] = sum + arr[i];
        }
        int res = 0;
        for (int ele : dp)
            res = Math.max(ele, res);
        return res;
    }

}
