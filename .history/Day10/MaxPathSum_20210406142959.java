public class MaxPathSum {

    public static int res = 0;

    public static int maxPathSum(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int lr = maxPathSum(node.left);
        int rr = maxPathSum(node.right);

        int max = Math.max(lr, rr) + node.data;
        res = Math.max(Math.max(max, node.data), Math.max(res, lr + rr + node.data));
    }

}
