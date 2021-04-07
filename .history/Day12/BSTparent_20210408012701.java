public class BSTparent {

    public static class ParentNode {
        int data;
        ParentNode left;
        ParentNode right;
        ParentNode parent;

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
        if (node == null)
            return null;
        ParentNode nn = new ParentNode(node.data);
        nn.parent = parent;

        nn.left = constructor(node.left, nn);
        nn.right = constructor(node.right, nn);
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(ParentNode node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += "[" + node.left.data + ",L], ";
        if (node.right != null)
            str += "[" + node.right.data + ",R]";
        if (node.parent != null)
            str += "[" + node.parent.data + ",P]";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        BSTparent parentTree = new BSTparent(tree.root);
        parentTree.display();
    }

}
