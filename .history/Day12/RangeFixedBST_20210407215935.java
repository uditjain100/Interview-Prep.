public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        filter(node, node, lb, ub);
    }

    public static void filter(BinarySearchTree.Node root, BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return;

        if (node.data < lb || node.data > ub) {
            BinarySearchTree.Node n = remove(root, node.data);
            filter(root, n, lb, ub);
            return;
        }

        filter(root, node.left, lb, ub);
        filter(root, node.right, lb, ub);
    }

    private static void display(BinarySearchTree.Node node) {
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

    public static int max(BinarySearchTree.Node node) {
        if (node.right == null)
            return node.data;
        return max(node.right);
    }

    public static BinarySearchTree.Node remove(BinarySearchTree.Node node, int data) {
        BinarySearchTree.Node res = remove(node, null, data, false);
        return res;
    }

    public static BinarySearchTree.Node remove(BinarySearchTree.Node node, BinarySearchTree.Node parent, int data,
            boolean isLeft) {
        if (node == null)
            return null;

        if (node.data < data) {
            return remove(node.right, node, data, false);
        } else if (node.data > data) {
            return remove(node.left, node, data, true);
        } else {
            BinarySearchTree.Node res = null;
            if (node.left == null && node.right == null)
                if (isLeft)
                    parent.left = null;
                else
                    parent.right = null;
            else if (node.left == null && node.right != null) {
                if (isLeft)
                    parent.left = node.right;
                else
                    parent.right = node.right;
                res = node.right;
            } else if (node.left != null && node.right == null) {
                if (isLeft)
                    parent.left = node.left;
                else
                    parent.right = node.left;
                res = node.left;
            } else {
                node.data = max(node.left);
                res = remove(node.left, node, node.data, true);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        filterBST(tree.root, 1, 45);
        tree.display();
    }

}
