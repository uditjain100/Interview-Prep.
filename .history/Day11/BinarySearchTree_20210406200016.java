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
        root = constructor(preOrder);
    }

    public static int idx = 0;

    public static Node constructor(int[] preOrder) {
        if (idx == preOrder.length)
            return null;

        Node nn = new Node(preOrder[idx++]);

        if (preOrder[idx] < node.data)
            nn.left = constructor(preOrder);
        else
            nn.right = constructor(preOrder);
        return nn;
    }

}
