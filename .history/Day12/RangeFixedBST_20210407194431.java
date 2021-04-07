public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        filter(node, lb, ub);
    }

    public static void filter(BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return;

        if (node.data < lb || node.data > ub) {
            remove(node, node.data);
            filter(node, lb, ub);
            return;
        }

        filter(node.left, lb, ub);
        filter(node.right, lb, ub);
    }

    public static int max(BinarySearchTree.Node node) {
        if (node.right == null)
            return node.data;
        return max(node.right);
    }

    public static void remove(BinarySearchTree.Node node, int data) {
        remove(node, null, data, false);
    }

    public static void remove(BinarySearchTree.Node node, BinarySearchTree.Node parent, int data, boolean isLeft) {
        if (node == null)
            return;

        if (node.data < data) {
            remove(node.right, node, data, false);
        } else if (node.data > data) {
            remove(node.left, node, data, true);
        } else {
            if (node.left == null && node.right == null) {
                if (parent == null)
                    parent = null;
                if (isLeft)
                    parent.left = null;
                else
                    parent.right = null;
            } else if (node.left == null && node.right != null) {
                if (isLeft)
                    parent.left = node.right;
                else
                    parent.right = node.right;
            } else if (node.left != null && node.right == null) {
                if (isLeft)
                    parent.left = node.left;
                else
                    parent.right = node.left;
            } else {
                node.data = max(node.left);
                remove(node.left, node, node.data, true);
            }
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        filter(tree.root, 1, 45);
        tree.display();
    }

}
