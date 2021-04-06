public class DeepestLeafNode {

    public static BinaryTree.Node leaf = null;
    public static int max = Integer.MIN_VALUE;

    public static BinaryTree.Node deepestLeaf(BinaryTree.Node node) {
        deepestLeaf(node, 0, false);
        return leaf;
    }

    public static void deepestLeaf(BinaryTree.Node node, int level, boolean isLeft) {
        if (node == null)
            return;
        if (isLeft && node.left == null && node.right == null) {
            if (max < level + 1) {
                max = level + 1;
                leaf = node;
            }
            return;
        }
        deepestLeaf(node.left, level + 1, true);
        deepestLeaf(node.right, level + 1, false);
    }

    public static void main(String[] args) {

    }
}
