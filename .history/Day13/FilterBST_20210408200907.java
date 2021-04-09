public class FilterBST {

    // *** */ https://www.geeksforgeeks.org/remove-bst-keys-outside-the-given-range/

    public static void filterBST(BinarySearchTree.Node node, int a, int b) {
        remove(node, null, a, b, false);
    }

    public static void remove(Node node, Node parent, int lb, int ub, boolean isLeft) {
        if (node == null)
            return;

        remove(node.left, node, data, true);
        remove(node.right, node, data, false);

        if (node.data < lb || node.data > ub) {
            if (node.left == null && node.right == null) {
                if (parent == null)
                    root = null;
                else {
                    if (isLeft)
                        parent.left = null;
                    else
                        parent.right = null;
                }
            } else if (node.left == null && node.right != null) {
                if (parent == null)
                    root = node.right;
                else {
                    if (isLeft)
                        parent.left = node.right;
                    else
                        parent.right = node.right;
                }
            } else if (node.left != null && node.right == null) {
                if (parent == null)
                    root = node.left;
                else {
                    if (isLeft)
                        parent.left = node.left;
                    else
                        parent.right = node.left;
                }
            } else {
                node.data = max(node.left);
                remove(node.left, node, node.data, true);
            }
        }
    }

}
