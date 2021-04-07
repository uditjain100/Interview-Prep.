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
        root = new Node(levelOrder[idx++]);
        constructor(root, levelOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int idx = 0;

    public static void constructor(Node node, int[] levelOrder, int lb, int ub) {
        if (idx == levelOrder.length || node == null)
            return;

        if (levelOrder[idx] < node.data)
            node.left = new Node(levelOrder[idx++]);
        else
            node.left = null;

        if (idx == levelOrder.length)
            return;

        if (levelOrder[idx] > node.data)
            node.right = new Node(levelOrder[idx++]);
        else
            node.right = null;

        constructor(node.left, levelOrder, lb, node.data);
        constructor(node.right, levelOrder, node.data, ub);
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