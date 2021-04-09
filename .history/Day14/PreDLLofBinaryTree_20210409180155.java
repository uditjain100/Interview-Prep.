public class PreDLLofBinaryTree {

    public static BinaryTree.Node DLLhead = null;
    public static BinaryTree.Node DLLprev = null;

    public static void DLL(BinaryTree.Node node) {

        BinaryTree.Node left = node.left;
        BinaryTree.Node right = node.right;

        if (DLLhead != null) {
            DLLhead = node;
        } else {
            DLLprev.right = node;
            node.left = DLLprev;
        }
        DLLprev = node;

        DLL(left);
        DLL(right);

    }

}
