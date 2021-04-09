public class AVLtree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private static Node root;

    public AVLtree() {
        root = null;
    }

    public AVLtree(int[] arr) {
        constructor(arr);
    }

    public static void constructor(int[] arr) {
        for (int ele : arr)
            insert(ele);
    }

    public static void insert(int data) {
        insert(root, data);
    }

    public static Node insert(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (node.data > data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);

        int bf = balanceFactor(node);

        if (bf > 1 && data < node.left.data)
            return rightRotate(node);
        else if (bf < 1 && data > node.right.data)
            return leftRotate(node);
        else if (bf > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        } else if (bf < 1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public static int max(Node node) {
        if (node.right == null)
            return node.data;
        return max(node.right);
    }

    public static void remove(int data) {
        remove(root, data);
    }

    public static Node remove(Node node, int data) {
        if (node == null)
            return null;

        if (node.data < data)
            node.right = remove(node.right, data);
        else if (node.data > data)
            node.left = remove(node.left, data);
        else {
            if (node.left == null && node.right == null)
                return null;
            else if (node.left == null && node.right != null)
                return node.right;
            else if (node.left != null && node.right == null)
                return node.left;
            else {
                node.data = max(node.left);
                node.left = remove(node.left, node.data);
            }
        }

        return node;
    }

    public static Node leftRotate(Node node) {
        Node a = node.right;
        Node b = a.left;

        a.left = node;
        node.right = b;

        return a;
    }

    public static Node rightRotate(Node node) {
        Node a = node.left;
        Node b = a.right;

        a.right = node;
        node.left = b;

        return a;
    }

    public static int balanceFactor(Node node) {
        return height(node.left) - height(node.right);
    }

    public static int height(Node node) {
        if (node == null)
            return 0;
        return Math.max(height(node.left), height(node.right)) + 1;
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

}
