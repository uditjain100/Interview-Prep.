public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        BinarySearchTree.Node parent = new BinarySearchTree.Node(-1);
        parent.left = node;
        filter(node, parent, lb, ub, false);
    }

    public static void filter(BinarySearchTree.Node node, BinarySearchTree.Node parent, int lb, int ub,
            boolean isLeft) {
        if (node == null)
            return;

        filter(node.left, node, lb, ub, true);
        filter(node.right, node, lb, ub, false);

        if (node.data < lb || node.data > ub) {
            System.out.println(node.data);
            if (isLeft) {
                if (node.left != null)
                    parent.left = node.left;
                else
                    parent.left = node.right;
            } else {
                if (node.left != null)
                    parent.right = node.left;
                else
                    parent.right = node.right;
            }
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        filterBST(tree.root, 1, 9);
        tree.display();
    }

}
