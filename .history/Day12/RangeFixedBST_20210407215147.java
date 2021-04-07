public class RangeFixedBST {

    public static void filterBST(BinarySearchTree.Node node, int lb, int ub) {
        filter(node, node, lb, ub);
    }

    public static void filter(BinarySearchTree.Node root, BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return;

        if (node.data < lb || node.data > ub) {
            System.out.println(node + " ******** " + node.data);
            remove(root, node.data);
            // filter(root, node, lb, ub);
            // return;
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

    public static void remove(BinarySearchTree.Node node, int data) {
        remove(node, null, data, false);
        System.out.println("***************************");
        display(node);
        System.out.println("***************************");
    }

    public static void remove(BinarySearchTree.Node node, BinarySearchTree.Node parent, int data, boolean isLeft) {
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

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        filterBST(tree.root, 1, 20);
        tree.display();
    }

}
