public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        filter(node, lb, ub);
    }

    public static void filter(BinarySearchTree.Node node, int lb, int ub) {
        if(node == null) return;

        if(node.data < lb || node.data > ub)
            remo
    }

    public static void remove(int data) {
        remove(root, null, data, false);
    }

    public static void remove(Node node, Node parent, int data, boolean isLeft) {
        if (node == null)
            return;

        if (node.data < data) {
            remove(node.right, node, data, false);
        } else if (node.data > data) {
            remove(node.left, node, data, true);
        } else {
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
                remove(node.left, node, node.data, true);
            }
        }
    }

}
