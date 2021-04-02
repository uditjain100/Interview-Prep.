public class BinaryTreeClone {

    public static BinaryTree.Node root;

    public BinaryTreeClone(BinaryTree.Node node) {
        root = constructor(node);
    }

    public static BinaryTree.Node constructor(BinaryTree.Node node) {
        if (node == null)
            return null;

        BinaryTree.Node nn = new BinaryTree.Node(node.data);
        nn.left = constructor(node.left);
        nn.right = constructor(node.right);
        return nn;
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

}
