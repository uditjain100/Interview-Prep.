public class MaxBtwTwoNodes {

    public static int getMax(BinarySearchTree.Node node, int a, int b) {
        BinarySearchTree.Node lca = LCA(node, a, b);
        return Math.max(getMaxInPath(lca, lca.data, a), getMaxInPath(lca, lca.data, b));
    }

    public static int getMaxInPath(BinarySearchTree.Node node, int dummyData, int data) {
        if (node == null)
            return 0;

        int res = Integer.MIN_VALUE;

        if (node.data > data)
            res = getMaxInPath(node.left, dummyData, data);
        else if (node.data < data)
            res = getMaxInPath(node.right, dummyData, data);
        else
            return res;
        return Math.max(res, node.data);
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

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(getMax(tree.root, 1, 10));
    }

}
