public class AVLtree {

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

    public AVLtree() {
        root = null;
    }

    public AVLtree(int[] arr) {
        root = constructor(arr);
    }

    public static Node constructor(int[] arr) {
        return null;
    }

}
