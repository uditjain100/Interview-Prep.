public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        filter(node, lb, ub);
    }

    public static void filter(BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return;

        if (node.data < lb || node.data > ub) {
            BinarySearchTree.Node n = remove(root, node.data);
            filter(root, n, lb, ub);
            return;
        }

        filter(node.left, lb, ub);
        filter(node.right, lb, ub);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        filterBST(tree.root, 1, 35);
        tree.display();
    }

}
