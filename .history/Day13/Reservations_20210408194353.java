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

    public Reservations(int k) {
        root = null;
        K = k;
    }

    public static void add(int currTime, int[] time) {
        remove(currTime - K);
        for(int  ele : time)
    }

    public static boolean check(Node node, int lb, int ub) {
        if (node == null)
            return false;
        if (node.data <= ub && node.data >= lb)
            return true;
        return check(node.left, lb, ub) || check(node.right, lb, ub);
    }

    public static int max(Node node) {
        if (node.right == null)
            return node.data;
        return max(node.right);
    }

    public static void remove(int data) {
        remove(root, null, data, false);
    }

    public static void remove(Node node, Node parent, int data, boolean isLeft) {
        if (node == null)
            return;

        remove(node.left, node, data, true);
        remove(node.right, node, data, false);

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
    }

    public static void main(String[] args) {

    }

}
