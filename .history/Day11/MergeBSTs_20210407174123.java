public class MergeBSTs {

    public static BinarySearchTree.Node mergeBSTs(BinarySearchTree.Node node1, BinarySearchTree.Node node2) {

        BinarySearchTree.Node head1 = BSTtoSortedDLL.DLLdisplay(node1);
        BinarySearchTree.Node head2 = BSTtoSortedDLL.DLLdisplay(node2);

        mergeLL(head1, head2);

    }

    public static BinarySearchTree.Node mergeLL(BinarySearchTree.Node head1, BinarySearchTree.Node head2) {

        BinarySearchTree.Node curr1 = head1;
        BinarySearchTree.Node curr2 = head2;

        BinarySearchTree.Node root = null;

        while (curr1 != null && curr2 != null) {
            if (curr1.data > curr2.data) {
                if (root == null) {

                } else {

                }
            } else {
                if (root == null) {

                } else {

                }
            }
        }

    }

}
