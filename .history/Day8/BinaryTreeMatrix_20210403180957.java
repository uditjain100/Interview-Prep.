import java.util.ArrayList;

public class BinaryTreeMatrix {

    public static int[][] createMatrix(BinaryTree.Node node, int size) {
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

        for (int ele : p.children)
            res[p.node.data][ele] = 1;

        return p;
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        int[][] res = createMatrix(tree.root, tree.size());
        for (int[] arr : res) {
            for (int ele : arr)
                System.out.print(ele + " ");
            System.out.println();
        }
    }

}
