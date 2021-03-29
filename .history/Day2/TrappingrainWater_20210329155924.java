public class TrappingrainWater {
    public static void main(String[] args) {

    }

    public static void fun(int[] arr) {

        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        int maxl = Integer.MIN_VALUE;
        int maxr = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
            l[i] = Math.max(arr[i], maxl);
        for (int i = arr.length - 1; i >= 0; i--)
            r[i] = Math.max(arr[i], maxr);

    }

}
