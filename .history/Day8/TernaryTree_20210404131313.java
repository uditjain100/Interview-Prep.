public class TernaryTree {
    public static class Node {
        int data;
        Node left;
        Node middle;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = this.middle = null;
        }
    }

    public static Node root;

    public TernaryTree(int[] pre) {
        root = constructor(pre);
    }

    public static Node constructor(int[] pre) {

    }

}
