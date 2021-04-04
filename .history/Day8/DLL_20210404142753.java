public class DLL {

    public static BinaryTree.Node head = null;
    public static BinaryTree.Node prev = null;

    public static void Dll(BinaryTree.Node node) {
        if (node == null)
            return;

        Dll(node.left);

        if (head == null)
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
        BinaryTree.Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + ", ");
            curr = curr.right;
        }
    }

    public static void CircularDllDisplay(BinaryTree.Node node) {
        Dll(node);
        prev.right = head;
        head.left = prev;
        BinaryTree.Node curr = head;
        System.out.print(curr.data + ", ");
        curr = curr.right;
        while (curr != head) {
            System.out.print(curr.data + ", ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {

        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        CircularDllDisplay(tree.root);

    }

}
