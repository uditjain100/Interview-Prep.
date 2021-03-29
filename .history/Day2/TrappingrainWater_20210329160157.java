public class TrappingrainWater {
    public static void main(String[] args) {

    }

    public static void fun(int[] arr) {

        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        int maxl = Integer.MIN_VALUE;
        int maxr = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxl = Math.max(arr[i], maxl);
            l[i] = maxl;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            maxr = Math.max(arr[i], maxr);
            r[i] = maxr;
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += Math.min(l[i], r[i]) - arr[i];
        }

    }

}
