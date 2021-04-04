public class SumTree {

    public static int createSumTree(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int res = node.data;
        int lr = createSumTree(node.left);
        int rr = createSumTree(node.right);

        if (node.left == null && node.right == null)
            node.data = 0;
        else
            node.data = ls + rs;
        return res + ls + rs;
    }

    public static void main(String[] args) {

        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        createSumTree(tree.root);
        tree.display();

    }

}
