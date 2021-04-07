public class BinarySearchTree {

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

    public BinarySearchTree(int[] preOrder) {
        root = constructor(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int idx = 0;

    public static Node constructor(int[] preOrder, int lb, int ub) {
        if (idx == preOrder.length || preOrder[idx] < lb || preOrder[idx] > ub)
            return null;

        Node nn = new Node(preOrder[idx++]);
        nn.left = constructor(preOrder, lb, preOrder[idx - 1]);
        nn.right = constructor(preOrder, preOrder[idx - 1], ub);
        return nn;
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

    public static void add(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (data > node.data)
            add(node.right, data);
        else
            add(node.right, data);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
    }

}
