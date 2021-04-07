public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        filter(node, null, lb, ub, false);
    }

    public static void filter(BinarySearchTree.Node node, BinarySearchTree.Node parent, int lb, int ub,
            boolean isLeft) {
        if (node == null)
            return;

        filter(node.left, node, lb, ub, true);
        filter(node.right, node, lb, ub, false);

        if (node.data < lb || node.data > ub) {
            if (isLeft) {

            } else {

            }
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        filterBST(tree.root, 1, 35);
        tree.display();
    }

}
