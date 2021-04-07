public class FixSwapNode {

    public static BinaryTree.Node first = null;
    public static BinaryTree.Node second = null;

    public static void fixNodes(BinaryTree.Node node) {
        fix(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (first == null || second == null)
            return;
        int temp = first.data;
        first.data = second.data;
        second.data = temp;
    }

    public static void fix(BinaryTree.Node node, int lb, int ub) {
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
        int[] preOrder = { 10, 5, 2, -1, -1, 20, -1, -1, 8, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        fixNodes(tree.root);
        tree.display();
    }

}
