public class BST {

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

    public static Node getRoot() {
        Node node = root;
        return node;
    }

    public BST(int[] arr) {
        root = constructor(arr, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static Node constructor(int[] arr, int lb, int ub) {

    }

}
