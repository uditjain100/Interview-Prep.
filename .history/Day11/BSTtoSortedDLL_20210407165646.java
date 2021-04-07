public class BSTtoSortedDLL {

    public static BinarySearchTree.Node DLLhead = null;
    public static BinarySearchTree.Node DLLprev = null;

    public static void DLL(BinarySearchTree.Node node) {
        if (node == null)
            return;

        DLL(node.left);
        if (DLLhead == null) {
            DLLhead = node;
        } else {
            DLLprev.right = node;
            node.left = DLLprev;
        }
        DLL(node.right);
    }

}
