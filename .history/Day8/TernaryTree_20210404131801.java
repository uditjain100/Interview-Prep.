public class TernaryTree {
    public static class Node {
        int data;
        Node left;
        Node middle;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = this.middle = null;
        }
    }

    public static Node root;

    public TernaryTree(int[] pre) {
        root = constructor(pre);
    }

    public static int idx = 0;

    public static Node constructor(int[] pre) {
        if (idx == pre.length)
            return null;

        Node nn = new Node(pre[idx++]);

        nn.left = constructor(pre);
        nn.middle = constructor(pre);
        nn.right = constructor(pre);
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(int data) {

        String str = node.data + " => ";

        if (node.left != null)
            str += "[ " + node.left + "," + " L ] , ";
        str += "[ " + node.middle + "," + " M ] , ";
        str += "[ " + node.right + "," + " R ]";

    }

}
