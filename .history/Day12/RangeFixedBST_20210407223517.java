public class RangeFixedBST {

    public static int max(Node node) {
        if (node.right == null)
            return node.data;
        return max(node.right);
    }

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
            if (node.left == null && node.right == null)
                if (isLeft)
                    parent.left = null;
                else
                    parent.right = null;
            else if (node.left == null && node.right != null)
                if (isLeft)
                    parent.left = node.right;
                else
                    parent.right = node.right;
            else if (node.left != null && node.right == null)
                if (isLeft)
                    parent.left = node.left;
                else
                    parent.right = node.left;
            else {
                node.data = max(node.left);
                filter(node.left, node, node.data, true);
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
