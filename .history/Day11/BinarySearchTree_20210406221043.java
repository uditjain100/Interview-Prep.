public class BinarySearchTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node root;

    public BinarySearchTree(int[] preOrder) {
        root = constructor(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int idx = 0;

    public static Node constructor(int[] preOrder, int lb, int ub) {
        if (idx == preOrder.length || preOrder[idx] < lb || preOrder[idx] > ub)
            return null;

        Node nn = new Node(preOrder[idx++]);
        nn.left = constructor(preOrder, lb, preOrder[idx - 1]);
        nn.right = constructor(preOrder, preOrder[idx - 1], ub);
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
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

    public static void add(int data) {
        if (root == null)
            root = new Node(data);
        else
            add(root, data);
    }

    public static void add(Node node, int data) {
        if (node == null)
            return;
        if (node.data > data) {
            if (node.left == null)
                node.left = new Node(data);
            else
                add(node.left, data);
        } else {
            if (node.right == null)
                node.right = new Node(data);
            else
                add(node.right, data);
        }
    }

    public static int max(Node node) {
        if (node.right == null)
            return node.data;
        return max(node.right);
    }

    public static void remove(int data) {
        remove(root, null, data, false);
        display(root);
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

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        tree.remove(40);
        // tree.display();
    }

}
