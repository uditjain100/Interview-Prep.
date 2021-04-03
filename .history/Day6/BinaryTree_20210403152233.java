import java.util.ArrayList;

public class BinaryTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node root;

    public BinaryTree(int[] preOrder) {
        root = constructor(preOrder);
    }

    public static int idx = 0;

    public static Node constructor(int[] preOrder) {
        if (idx == preOrder.length || preOrder[idx] == -1) {
            idx++;
            return null;
        }

        Node nn = new Node(preOrder[idx++]);
        nn.left = constructor(preOrder);
        nn.right = constructor(preOrder);
        return nn;
    }

    public static ArrayList<Integer> preOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        preOrder(root, res);
        return res;
    }

    public static void preOrder(Node node, ArrayList<Integer> list) {
        if (node == null)
            return;
        list.add(node.data);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }

    public static ArrayList<Integer> inOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
    }

    public static void inOrder(Node node, ArrayList<Integer> list) {
        if (node == null)
            return;
        inOrder(node.left, list);
        list.add(node.data);
        inOrder(node.right, list);
    }

    public static ArrayList<Integer> postOrder() {
        ArrayList<Integer> res = new ArrayList<>();
        postOrder(root, res);
        return res;
    }

    public static void postOrder(Node node, ArrayList<Integer> list) {
        if (node == null)
            return;
        postOrder(node.left, list);
        postOrder(node.right, list);
        list.add(node.data);
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
    }
}