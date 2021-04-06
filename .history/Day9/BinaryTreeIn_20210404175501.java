import java.util.ArrayList;

public class BinaryTreeIn {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node next;

        public Node(int data) {
            this.data = data;
            this.left = this.right = this.next = null;
        }
    }

    public static Node root;

    public BinaryTreeIn(int[] preOrder) {
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

    public static int size() {
        return size(root);
    }

    private static int size(Node node) {
        if (node == null)
            return 0;
        return size(node.left) + size(node.right) + 1;
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

    public static void populateInOrderSuccesor() {
        populateInOrderSucc(root, null);
    }

    public static Node leftMostOfRight(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public static void populateInOrderSucc(Node node, Node parent) {
        if (node == null)
            return;

        if (node.right == null)
            node.next = parent;
        else
            node.next = leftMostOfRight(node.right);
        populateInOrderSucc(node.left, node);
        populateInOrderSucc(node.right, node);
    }

    public static void main(String[] args) {

    }

}
