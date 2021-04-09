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

        getPostOrder(pre, in, psi + noe + 1, pei, idx + 1, iei);
        getPostOrder(pre, in, psi + 1, psi + noe, isi, idx - 1);
    }

    public static void getPreOrder(int[] post, int[] in) {
        res.clear();
        getPreOrder(post, in, 0, post.length - 1, 0, in.length - 1);
        System.out.println(res);
    }

    public static void getPreOrder(int[] post, int[] in, int psi, int pei, int isi, int iei) {
        if (isi > iei || psi > pei)
            return;

        res.add(post[pei]);

        int idx = isi;
        while (in[idx] != post[pei])
            idx++;

        int noe = idx - isi;

        getPreOrder(post, in, psi, psi + noe - 1, isi, idx - 1);
        getPreOrder(post, in, psi + noe, pei - 1, idx + 1, iei);
    }

    public static void getInOrder(int[] post, int[] pre) {
        res.clear();
        getInOrder(post, pre, 0, post.length - 1, 0, pre.length - 1);
        System.out.println(res);
    }

    public static void getInOrder(int[] post, int[] pre, int posi, int poei, int prsi, int prei) {
        if (prsi > prei || posi > poei)
            return;

        res.add(post[poei]);

        int idx = prsi;
        while (pre[idx] != post[poei])
            idx++;

        int noe = idx - prsi;

    }

    public static void main(String[] args) {
        getPostOrder(new int[] { 12, 7, 3, 9, 42, 32, 52 }, new int[] { 3, 7, 9, 12, 32, 42, 52 });
        getPreOrder(new int[] { 3, 9, 7, 32, 52, 42, 12 }, new int[] { 3, 7, 9, 12, 32, 42, 52 });
    }

}
