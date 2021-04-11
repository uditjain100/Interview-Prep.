import java.util.Arrays;

public class OrderIsPreOrder {

    public static boolean check(int[] pre) {
        int[] in = new int[pre.length];
        for (int i = 0; i < pre.length; i++)
            in[i] = pre[i];
        Arrays.sort(in);
        return checkIfCan(pre, 0, pre.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkIfCan(int[] pre, int psi, int pei, int lb, int ub) {
        return true;

    }

}
