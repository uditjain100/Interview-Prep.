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

}
