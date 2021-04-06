import java.util.ArrayList;

public class BinaryTreeIn {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node inSucc;
        Node preSucc;
        Node postSucc;
        Node inPred;
        Node prePred;
        Node postPred;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
            this.inSucc = this.postSucc = this.preSucc = null;
            this.inPred = this.postPred = this.prePred = null;
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
            str += "[" + node.left.data + "," + "L], ";
        if (node.right != null)
            str += "[" + node.right.data + "," + "R], ";
        if (node.inSucc != null)
            str += "[" + node.inSucc.data + "," + "IS], ";
        if (node.preSucc != null)
            str += "[" + node.preSucc.data + "," + "PRS], ";
        if (node.postSucc != null)
            str += "[" + node.postSucc.data + "," + "POS], ";
        if (node.inPred != null)
            str += "[" + node.inPred.data + "," + "IP], ";
        if (node.prePred != null)
            str += "[" + node.prePred.data + "," + "PRP], ";
        if (node.postPred != null)
            str += "[" + node.postPred.data + "," + "POP], ";
        System.out.println(str);

        display(node.left);
        display(node.right);

    }

    public static Node leftMostOfRight(Node node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public static Node inS = null;
    public static Node preS = null;
    public static Node postS = null;
    public static Node inP = null;
    public static Node preP = null;
    public static Node postP = null;

    public static void populateInOrderSuccesor() {
        populateInOrderSucc(root);
    }

    public static void populateInOrderSucc(Node node) {
        if (node == null)
            return;

        populateInOrderSucc(node.right);

        node.inSucc = inS;
        inS = node;

        populateInOrderSucc(node.left);
    }

    public static void populateInOrderPred() {
        populateInOrderPred(root);
    }

    public static void populateInOrderPred(Node node) {
        if (node == null)
            return;

        populateInOrderPred(node.left);

        node.inPred = inP;
        inP = node;

        populateInOrderPred(node.right);
    }

    public static void populatePreOrderSuccesor() {
        populatePreOrderSucc(root);
    }

    public static void populatePreOrderSucc(Node node) {
        if (node == null)
            return;

        populatePreOrderSucc(node.right);
        populatePreOrderSucc(node.left);
        node.preSucc = preS;
        preS = node;
    }

    public static void populatePreOrderPred() {
        populatePreOrderPred(root);
    }

    public static void populatePreOrderPred(Node node) {
        if (node == null)
            return;

        node.prePred = preP;
        preP = node;
        populatePreOrderPred(node.left);
        populatePreOrderPred(node.right);
    }

    public static void populatePostOrderSuccesor() {
        populatePostOrderSucc(root);
    }

    public static void populatePostOrderSucc(Node node) {
        if (node == null)
            return;
        node.postSucc = postS;
        postS = node;

        populatePostOrderSucc(node.right);
        populatePostOrderSucc(node.left);
    }

    public static void populatePostOrderPred() {
        populatePostOrderPred(root);
    }

    public static void populatePostOrderPred(Node node) {
        if (node == null)
            return;

        populatePostOrderPred(node.left);
        populatePostOrderPred(node.right);
        node.postPred = postP;
        postP = node;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTreeIn tree = new BinaryTreeIn(preorder);
        tree.display();
        tree.populateInOrderSuccesor();
        tree.populatePreOrderSuccesor();
        tree.populatePostOrderSuccesor();
        tree.populateInOrderPred();
        tree.populatePreOrderPred();
        tree.populatePostOrderPred();
        tree.display();
    }

}
