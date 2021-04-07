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

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        DLLdisplay(tree.root);
    }

}
