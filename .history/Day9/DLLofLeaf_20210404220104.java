public class DLLofLeaf {

    public static BinaryTree.Node Dllhead = null;
    public static BinaryTree.Node Dllprev = null;

    public static void DLL(BinaryTree.Node node) {
        DLL(node, null, false);
    }

    public static void DLL(BinaryTree.Node node, BinaryTree.Node parent, boolean isLeft) {

        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            if (Dllhead == null) {
                Dllhead = node;
            } else {
                Dllprev.right = node;
                node.left = Dllprev;
            }
            Dllprev = node;
            if (isLeft)
                parent.left = null;
            else
                parent.right = null;
        }

        DLL(node.left, node, true);
        DLL(node.right, node, false);

    }

}
