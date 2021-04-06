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
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        System.out.println(deepestLeaf(tree.root).data);
    }
}
