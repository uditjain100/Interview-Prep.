import java.util.Arrays;

public class OrderIsPreOrder {

    public static boolean check(int[] pre) {
        int[] in = new int[pre.length];
        for (int i = 0; i < pre.length; i++)
            in[i] = pre[i];
        Arrays.sort(in);
        return checkIfCan(pre, 0, pre.length - 1, in, 0, in.length - 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static boolean checkIfCan(int[] pre, int psi, int pei, int[] in, int isi, int iei, int lb, int ub) {
        if (isi > iei || psi > pei)
            return true;

        if (isi == iei)
            System.out.println(in[isi]);

        int idx = isi;
        while (in[idx] != pre[psi])
            idx++;

        int noe = idx - isi;

        for (int i = psi + 1; i < psi + noe + 1; i++)
            if (pre[i] < lb || pre[i] > pre[psi])
                return false;
        for (int i = psi + noe + 1; i < pei; i++)
            if (pre[i] < pre[psi] || pre[i] > ub)
                return false;

        return checkIfCan(pre, psi + 1, psi + noe, in, isi, idx - 1, lb, pre[psi])
                && checkIfCan(pre, psi + noe + 1, pei, in, idx + 1, iei, pre[psi], ub);
    }

    public static void main(String[] args) {
        System.out.println(check(new int[] { 890, 325, 290, 530, 965 }));
    }

}
