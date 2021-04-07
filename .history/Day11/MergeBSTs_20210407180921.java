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

        if (curr1 != null) {
            curr.right = curr1;
            curr1.left = curr;
        }
        if (curr2 != null) {
            curr.right = curr2;
            curr2.left = curr;
        }
        return root;
    }

    public static void display(BinarySearchTree.Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += "[" + node.left.data + ",L], ";
        if (node.right != null)
            str += "[" + node.right.data + ",R]";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        int[] pre1 = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree1 = new BinarySearchTree(pre1);
        tree1.display();
        BinarySearchTree.Node root1 = tree1.root;
        int[] pre2 = new int[] { 12, 7, 3, 9, 42, 32, 52 };
        BinarySearchTree tree2 = new BinarySearchTree(pre2);
        tree2.display();
        BinarySearchTree.Node root2 = tree2.root;
        BinarySearchTree.Node head1 = BSTtoSortedDLL.DLLdisplay(tree1.root);
        BinarySearchTree.Node head2 = BSTtoSortedDLL.DLLdisplay(tree2.root);
        // tree1.display();
        // tree2.display();

    }

}
