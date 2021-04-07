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

    public static BinarySearchTree.Node DLLdisplay(BinarySearchTree.Node root) {
        DLL(root);
        BinarySearchTree.Node node = DLLhead;
        while (node != null) {
            System.out.print(node.data + " => ");
            node = node.right;
        }
        return DLLhead;
    }

    public static BinarySearchTree.Node DLLtoBinaryST(BinarySearchTree.Node node) {
        int count = 0;
        BinarySearchTree.Node curr = node;
        while (node != null) {
            node = node.right;
            count++;
        }
        head = node;
        return DLLtoBST(count);
    }

    public static BinarySearchTree.Node head = null;

    public static BinarySearchTree.Node DLLtoBST(int n) {
        if (n <= 0)
            return null;

        BinarySearchTree.Node left = DLLtoBST(n / 2);

        BinarySearchTree.Node root = head;
        head = head.right;
        root.left = left;

        root.right = DLLtoBST((n / 2) - 1);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        DLLtoBinaryST(DLLdisplay(tree.root));
        tree.display();
    }

}
