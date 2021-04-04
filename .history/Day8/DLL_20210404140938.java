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

        }

    }

}
