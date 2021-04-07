public class BSTfromLevelOrder {

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

    public BSTfromLevelOrder(int[] levelOrder) {
        root = new Node(levelOrder[idx++]);
        constructor(root, levelOrder);
    }

    public static int idx = 0;

    public static void constructor(Node node, int[] levelOrder) {
        if (idx == levelOrder.length || node == null)
            return;

        if (levelOrder[idx] < node.data)
            nn.left = new Node(levelOrder[idx]);
        else
            nn.left = null;

        idx++;
        if (idx == levelOrder.length)
            return;

        if (levelOrder[idx] > node.data)
            nn.right = new Node(levelOrder[idx]);
        else
            nn.right = null;

        idx++;
        constructor(node.left, levelOrder);
        constructor(node.right, levelOrder);
    }

}
