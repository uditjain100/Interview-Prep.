import java.util.ArrayList;
import java.util.PriorityQueue;

public class BinaryTreeMatrix {

    public static class MatNode {
        int data;
        MatNode left;
        MatNode right;

        public MatNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static MatNode root;

    public BinaryTreeMatrix(int[][] res) {
        PriorityQueue<int[]> pq = sortMatrix(res);
        root = constructor(pq);
    }

    public static MatNode constructor(PriorityQueue<int[]> pq) {

        boolean[] parent = new boolean[pq.size()];
        MatNode[] nodeArr = new MatNode(pq.size());

        while (!pq.isEmpty()) {
            int[] arr = pq.remove();
            nodeArr[arr[1]] = new MatNode(arr[1]);
            if (arr[0] != 0) {

            }
        }

        return new MatNode(0);
    }

    public static PriorityQueue<int[]> sortMatrix(int[][] res) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            return b[0] - a[0];
        });

        int[] countArr = new int[res.length];

        int i = 0;
        for (int[] arr : res) {
            for (int ele : arr)
                countArr[i] += ele;
            i++;
        }

        i = 0;
        for (int ele : countArr)
            pq.add(new int[] { ele, i++ });

        return pq;
    }

    public static int[][] createMatrix(BinaryTree.Node node, int size) {
        int[][] res = new int[size + 1][size + 1];
        createMatrix(node, res);
        return res;
    }

    public static int[][] createMatrix(int[] pre, int[] in) {
        int[][] res = new int[pre.length + 1][pre.length + 1];
        createMatrix(pre, 0, pre.length - 1, in, 0, in.length - 1, res);
        return res;
    }

    public static class Pair {
        BinaryTree.Node node;
        ArrayList<Integer> children;

        public Pair(BinaryTree.Node node) {
            this.node = node;
            this.children = new ArrayList<>();
        }
    }

    public static Pair createMatrix(BinaryTree.Node node, int[][] res) {
        if (node == null)
            return null;

        Pair p = new Pair(node);

        Pair lp = createMatrix(node.left, res);
        Pair rp = createMatrix(node.right, res);

        if (lp != null) {
            p.children.addAll(lp.children);
            p.children.add(lp.node.data);
        }
        if (rp != null) {
            p.children.addAll(rp.children);
            p.children.add(rp.node.data);
        }

        for (int ele : p.children)
            res[p.node.data][ele] = 1;

        return p;
    }

    public static void createMatrix(int[] pre, int psi, int pei, int[] in, int isi, int iei, int[][] res) {
        if (isi > iei || psi > pei)
            return;

        for (int i = psi + 1; i <= pei; i++)
            res[pre[psi]][pre[i]] = 1;

        int idx = isi;
        while (pre[psi] != in[idx])
            idx++;

        int totalElements = idx - isi;

        createMatrix(pre, psi + 1, psi + totalElements, in, isi, idx - 1, res);
        createMatrix(pre, psi + totalElements + 1, pei, in, idx + 1, iei, res);

    }

    public static void main(String[] args) {

        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        int[][] res = createMatrix(tree.root, tree.size());
        for (int[] arr : res) {
            for (int ele : arr)
                System.out.print(ele + " ");
            System.out.println();
        }

        ArrayList<Integer> preOrder = tree.preOrder();
        ArrayList<Integer> inOrder = tree.inOrder();
        ArrayList<Integer> postOrder = tree.postOrder();

        // System.out.println(preOrder);
        // System.out.println(inOrder);
        // System.out.println(postOrder);

        int[] pre2 = new int[preOrder.size()];
        int[] in2 = new int[inOrder.size()];
        int[] post2 = new int[postOrder.size()];

        int i = 0;
        for (int ele : preOrder)
            pre2[i++] = ele;
        i = 0;
        for (int ele : inOrder)
            in2[i++] = ele;
        i = 0;
        for (int ele : postOrder)
            post2[i++] = ele;

        res = createMatrix(pre2, in2);

        System.out.println("*********************");

        for (int[] arr : res) {
            for (int ele : arr)
                System.out.print(ele + " ");
            System.out.println();
        }

        BinaryTreeMatrix mat = new BinaryTreeMatrix(res);

    }

}
