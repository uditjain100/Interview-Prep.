public class DoubleTree {

    public static void createDoubleTree(BinaryTree.Node node) {
        if (node == null)
            return;

        BinaryTree.Node nn = new BinaryTree.Node(node.data);
        nn.left = node.left;
        node.left = nn;

        createDoubleTree(node.left);
        createDoubleTree(node.right);
    }

}
