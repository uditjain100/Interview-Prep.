public class BSTs1ToN {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node root = null;

    public static void constructBSTs(int n) {
        construct(n, 1, n);
    }

    public static void constructor(int n, int lb, int ub) {

        Node nn = null;
        for (int i = lb; i <= ub; i++) {

        }
        nn = new Node(i);
        nn.left = constructor(n, lb, i - 1);
        nn.right = constructBSTs(n, i + 1, ub);

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
