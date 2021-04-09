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
        for (int ele : arr) {
            insert(root, ele);
            int bf = balanceFactor(root);

        }
    }

    public static Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data > data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);
        return node;
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
