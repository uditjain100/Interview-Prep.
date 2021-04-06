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

    public static void main(String[] args) {
        int[] preorder = { 1, 2, -1, 3, -1, -1, 4, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        createDoubleTree(tree.root);
        tree.display();
    }

}
