public class RemoveNodeLTk {

    public static void remove(BinaryTree.Node node, int k) {
        remove(node, null, k);
    }

    public static boolean remove(BinaryTree.Node node, BinaryTree.Node parent, int k) {
        if (node == null || k == 1)
            return false;
        if (node.left == null && node.right == null && k != 1)
            return true;

        boolean lr = remove(node.left, node, k - 1);
        if (lr)
            node.left = null;
        boolean rr = remove(node.right, node, k - 1);
        if (rr)
            node.right = null;
        return lr && rr;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        remove(tree.root, 4);
        tree.display();
    }

}
