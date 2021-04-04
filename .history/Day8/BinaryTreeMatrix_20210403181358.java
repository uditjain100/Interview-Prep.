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

        if (lp != null) {
            p.children.addAll(lp.children);
            p.children.addAll(lp.node.data);
        }
        if (rp != null) {
            p.children.addAll(rp.children);
            p.children.addAll(rp.node.data);
        }
        System.out.println(p.children);

        for (int ele : p.children)
            res[p.node.data][ele] = 1;

        return p;
    }

    public static void main(String[] args) {

        int[] preOrder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
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
