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
        for (int ele : time) {
            if (!check(root, ele - K, ele + K))
                add(ele);
            else
                System.out.println(ele + " *********** ");
        }
        display();
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

    public static void main(String[] args) {
        Reservations resObj = new Reservations(4);
        add(0, new int[] { 2 });
        add(3, new int[] { 15, 7, 20, 3 });
        add(6, new int[] { 30, 17, 35, 45 });
    }

}
