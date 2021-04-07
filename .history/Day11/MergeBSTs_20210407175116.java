public class MergeBSTs {

    public static BinarySearchTree.Node mergeBSTs(BinarySearchTree.Node node1, BinarySearchTree.Node node2) {

        BinarySearchTree.Node head1 = BSTtoSortedDLL.DLLdisplay(node1);
        BinarySearchTree.Node head2 = BSTtoSortedDLL.DLLdisplay(node2);

        BinarySearchTree.Node root = mergeLL(head1, head2);

        BSTtoSortedDLL.DLLdisplay(root);

        return BSTtoSortedDLL.DLLtoBinaryST(root);
    }

    public static BinarySearchTree.Node mergeLL(BinarySearchTree.Node head1, BinarySearchTree.Node head2) {

        BinarySearchTree.Node curr1 = head1;
        BinarySearchTree.Node curr2 = head2;

        BinarySearchTree.Node root = null;
        BinarySearchTree.Node curr = root;

        while (curr1 != null && curr2 != null) {
            if (curr1.data > curr2.data) {
                if (root == null) {
                    root = curr2;
                    curr = root;
                } else {
                    curr.right = curr2;
                    curr2.left = curr;
                }
                curr2 = curr2.right;
            } else {
                if (root == null) {
                    root = curr1;
                    curr = root;
                } else {
                    curr.right = curr1;
                    curr1.left = curr;
                }
                curr1 = curr1.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {

        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree1 = new BinarySearchTree(pre);
        tree1.display();
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree2 = new BinarySearchTree(pre);
        tree2.display();

    }

}
