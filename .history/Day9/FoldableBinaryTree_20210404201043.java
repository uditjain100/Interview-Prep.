public class FoldableBinaryTree {

    public static boolean isFoldable(BinaryTree.Node node) {
        if (node == null || (node.left == null && node.right == null))
            return true;
        if ((node.left != null && node.right == null) || (node.left == null && node.right != null))
            return false;
        return isMirror(node.left, node.right);
    }

    public static boolean isMirror(BinaryTree.Node node1, BinaryTree.Node node2) {
        if ((node1 == null && node2 != null) || (node1 != null && node2 == null))
            return false;
        if (node1 == null && node2 == null)
            return true;
        return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
    }

    public static void main(String[] args) {

        int[] preorder = { 1, 2, -1, 3, -1, -1, 4, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        System.out.println(isFoldable(tree.root));

    }

}
