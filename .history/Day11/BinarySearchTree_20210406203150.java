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
        root = constructor(preOrder, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static Node constructor(int[] preOrder, int idx, int lb, int ub) {
        if (idx == preOrder.length || preOrder[idx] < lb || preOrder[idx] > ub)
            return null;

        Node nn = new Node(preOrder[idx++]);
        nn.left = constructor(preOrder, idx, lb, preOrder[idx]);
        nn.right = constructor(preOrder, idx, preOrder[idx], ub);
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

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
    }

}
