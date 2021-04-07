public class BSTtoSortedDLL {

    public static BinarySearchTree.Node DLLhead = null;
    public static BinarySearchTree.Node DLLprev = null;

    public static void DLL(BinarySearchTree.Node node) {
        if (node == null)
            return;

        DLL(node.left);
        if (DLLhead == null)
            DLLhead = node;
        else {
            DLLprev.right = node;
            node.left = DLLprev;
        }
        DLLprev = node;
        DLL(node.right);
    }

    public static void DLLdisplay(BinarySearchTree.Node node) {
        while (node != null) {
            System.out.print(node.data + " => ");
            node = node.right;
        }
    }

}
