public class FoldableBinaryTree {

    public static boolean isFoldable(BinaryTree.Node node) {
        if (node == null || (node.left == null && node.right == null))
            return true;
        if ((node.left != null && node.right == null) || (node.left == null && node.right != null))
            return false;
    }

    public static boolean isMirror(BinaryTree.Node node1, BinaryTree.Node node2) {
        if ((node1 == null && node2 != null) || (node1 != null && node2 == null))
            return false;
    }

    public static void main(String[] args) {

    }

}
