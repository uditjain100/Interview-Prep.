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

    public static Node constructor(int[]    preOrder) {

    }

    public static void main(String[] args) {

    }
}