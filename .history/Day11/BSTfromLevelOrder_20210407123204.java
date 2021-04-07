import java.util.LinkedList;

public class BSTfromLevelOrder {

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

    public BSTfromLevelOrder(int[] levelOrder) {
        root = constructor(levelOrder);
    }

    public static class Pair {
        Node node;
        int lb;
        int ub;

        public Pair(Node node, int lb, int ub) {
            this.node = node;
            this.lb = lb;
            this.ub = ub;
        }
    }

    public static Node constructor(int[] levelOrder) {
        int idx = 0;
        LinkedList<Pair> queue = new LinkedList<>();
        queue.addLast(new Pair(new Node(levelOrder[idx++]), Integer.MIN_VALUE, Integer.MAX_VALUE));
        Node root = queue.getFirst().node;

        while (!queue.isEmpty() && idx != levelOrder.length) {
            int size = queue.size();
            while (size-- > 0) {
                Pair rp = queue.removeFirst();
                if (idx == levelOrder.length)
                    break;
                if (levelOrder[idx] > rp.lb && levelOrder[idx] < rp.node.data) {
                    rp.node.left = new Node(levelOrder[idx++]);
                    queue.addLast(new Pair(rp.node.left, rp.lb, rp.node.data));
                } else
                    rp.node.left = null;
                if (idx == levelOrder.length)
                    break;
                if (levelOrder[idx] > rp.node.data && levelOrder[idx] < rp.ub) {
                    rp.node.right = new Node(levelOrder[idx++]);
                    queue.addLast(new Pair(rp.node.right, rp.node.data, rp.ub));
                } else
                    rp.node.right = null;
            }
        }
        return root;
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

    public static void inOrder() {
        inOrder(root);
    }

    public static void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + ", ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 4, 12, 3, 6, 8, 1, 5, 10 };
        BSTfromLevelOrder tree = new BSTfromLevelOrder(arr);
        tree.display();
        inOrder();
    }
}