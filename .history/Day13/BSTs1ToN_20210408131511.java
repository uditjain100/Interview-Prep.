import java.util.ArrayList;

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
    }

    public static ArrayList<Node> constructor(int s, int e) {

        ArrayList<Node> res = new ArrayList<>();

        if (s > e) {

        }

        for (int i = 1; i <= n; i++) {
            Node nn = new Node(i);
            boolean[] vis = new boolean[n + 1];
            vis[i] = true;
            construct(nn, n, i, new boolean[n + 1], false);
            vis[i] = false;
        }

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
