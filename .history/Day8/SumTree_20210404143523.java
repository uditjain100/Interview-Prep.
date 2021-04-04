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

}
