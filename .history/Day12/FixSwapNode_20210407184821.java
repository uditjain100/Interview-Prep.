public class FixSwapNode {

    public static BinarySearchTree.Node first = null;
    public static BinarySearchTree.Node second = null;

    public static void fixNodes(BinarySearchTree.Node node) {
        fix(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (first == null || second == null)
            return;
    }

    public static void fix(BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return;

        if (node.data < lb || node.data > ub) {
            if (first == null)
                first = node;
            else {
                second = node;
                return;
            }
        }
        fix(node.left, lb, node.data);
        fix(node.right, node.data, ub);
    }

    public static void main(String[] args) {

    }

}
