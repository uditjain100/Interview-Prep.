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
            if (parent == null)
                return;
            if (isLeft)
                parent.left = null;
            else
                parent.right = null;
            return;
        }

        DLL(node.left, node, true);
        DLL(node.right, node, false);
    }

    public static void DllDisplay(BinaryTree.Node node) {
        DLL(node);
        BinaryTree.Node curr = Dllhead;
        while (curr != null) {
            System.out.print(curr.data + ", ");
            curr = curr.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        DllDisplay(tree.root);
        tree.display();

    }

}
