import java.util.ArrayList;

public class BinaryTreeMatrix {

    public static int[][] createMatrix(int[] pre, int[] in, int size) {
        int[][] res = new int[size + 1][size + 1];
        createMatrix(node, res);
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

        if (lp != null)
            p.children.addAll(lp.children);
        if (rp != null)
            p.children.addAll(rp.children);

    }

}
