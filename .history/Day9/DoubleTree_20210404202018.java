public class DoubleTree {

    public static void createDoubleTree(BinaryTree.Node node) {
        if (node == null)
            return;

        createDoubleTree(node.left);
        createDoubleTree(node.right);

        BinaryTree.Node nn = new BinaryTree.Node(node.data);
        nn.left = node.left;
        node.left = nn;

    }

}
