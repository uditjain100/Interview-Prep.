import java.util.ArrayList;

public class PostUsingPreAndIn {

    public static void getPostOrder(int[] pre, int[] in) {
        getPostOrder(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void getPostOrder(int[] pre, int[] in, int psi, int pei, int isi, int iei) {
        if (isi > iei || psi > pei)
            return;

        res.add(pre[psi]);

        int idx = isi;
        while (in[idx] != pre[psi])
            idx++;

        int noe = idx - isi;

    }

}
