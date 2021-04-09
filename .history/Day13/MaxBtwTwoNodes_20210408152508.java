public class MaxBtwTwoNodes {

    public static int getMax(BinarySearchTree.Node node, int a, int b) {
        BinarySearchTree.Node lca = LCA(node, a, b);

    }

    public static int getMaxInPath(BinarySearchTree.Node node, int data) {
        if (node == null)
            return 0;

        int res = Integer.MIN_VALUE;

        if (node.data > data) {

        } else if (curr.data < data) {

        } else {

        }

    }

    public static BinarySearchTree.Node LCA(BinarySearchTree.Node node, int a, int b) {
        if (node == null)
            return null;
        if (node.data > a && node.data > b)
            return LCA(node.left, a, b);
        else if (node.data < a && node.data < b)
            return LCA(node.right, a, b);
        else {
            return node;
        }
    }

}
