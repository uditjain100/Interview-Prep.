public class BSTparent {

    public static class ParentNode {
        int data;
        Node left;
        Node right;
        Node parent;

        public ParentNode(int data) {
            this.data = data;
            this.left = this.right = this.parent = null;
        }
    }

    public static ParentNode root = null;

    public BSTparent(BinarySearchTree.Node node) {
        root = constructor(node, null);
    }

    public static ParentNode constructor(BinarySearchTree.Node node, ParentNode parent) {

        ParentNode nn = new ParentNode(node.data);
        nn.parent = parent;

        nn.left = constructor(node.left, node);
        nn.right = constructor(node.right, node);
        return nn;
    }

}
