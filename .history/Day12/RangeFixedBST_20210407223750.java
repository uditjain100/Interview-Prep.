public class RangeFixedBST {

    public static BinarySearchTree.Node max(BinarySearchTree.Node node) {
        if (node.right == null)
            return node;
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
                BinarySearchTree.Node tempNode = max(node.left);
                int temp = tempNode.data;
                tempNode = node.data;
                node.data = temp;
                filter(node.left, node, ub, lb, true);
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
