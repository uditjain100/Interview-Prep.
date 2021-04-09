public class Reservations {

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
    public static int K;

    public static Reservations(int k) {
        root = null;
        K = k;
    }

    public static void add(int currTime, int time) {
        remove(currTime - K);
    }

    public static void remove(int data) {
        remove(root, null, data, false);
    }

    public static void remove(Node node, Node parent, int data, boolean isLeft) {
        if (node == null)
            return;

        if (node.data <= data) {
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

        if (node.data > data) {
            remove(node.left, node, data, true);
        } else if (node.data < data) {
            remove(node.right, node, data, false);
        } else {

        }
    }

}
