import java.util.ArrayList;
import java.util.Collections;

public class PostUsingPreAndIn {

    public static void getPostOrder(int[] pre, int[] in) {
        res.clear();
        getPostOrder(pre, in, 0, pre.length - 1, 0, in.length - 1);
        Collections.reverse(res);
        System.out.println(res);
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

        getPostOrder(pre, in, psi + noe + 1, pei, isi, idx - 1);
        getPostOrder(pre, in, psi + 1, psi + noe, idx + 1, iei);
    }

}
