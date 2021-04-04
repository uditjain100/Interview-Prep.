public class DLL {

    public static BinaryTree.Node head = null;
    public static BinaryTree.Node prev = null;

    public static void Dll(BinaryTree.Node node) {
        if (node == null)
            return;

        Dll(node.left);

        if (head = null)
            head = node;
        else {
            prev.right = node;
            node.left = prev;
        }

        prev = node;

        Dll(node.right);
    }

    public static void DllDisplay(BinaryTree.Node node) {
        Dll(node);
        BinaryTree.Node curr = node;
        while (curr != null) {
            System.out.print(curr.data + ", ");
        }
    }

}
