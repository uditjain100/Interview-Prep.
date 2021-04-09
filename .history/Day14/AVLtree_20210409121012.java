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
        root = constructor(arr);
    }

    public static Node constructor(int[] arr) {
        Node root = null;
        for (int ele : arr)
            root = insert(root, ele);
        return root;
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
