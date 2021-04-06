public class HeightOfSpecialBinaryTree {

    public static BinaryTree.Node DLLhead = null;
    public static BinaryTree.Node DLLprev = null;

    public static void DLLleaf(BinaryTree.Node node) {

        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            if (DLLhead == null)
                DLLhead = node;
            else {
                DLLprev.right = node;
                node.left = DLLprev;
            }
            DLLprev = node;
        }

        DLLleaf(node.left);
        DLLleaf(node.right);

    }

}
