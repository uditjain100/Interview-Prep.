public class MaxPathSum {

    public static int res = Integer.MIN_VALUE;

    public static int findmaxPathSum(BinaryTree.Node node) {
        maxPathSum(node);
        return res;
    }

    public static int maxPathSum(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int lr = maxPathSum(node.left);
        int rr = maxPathSum(node.right);

        int max = Math.max(lr, rr) + node.data;
        res = Math.max(Math.max(max, node.data), Math.max(res, lr + rr + node.data));
        return Math.max(max, node.data);
    }

    public static int findmaxPathSumBtwLeaves(BinaryTree.Node node) {
        maxPathSumBtwLeaves(node);
        return res;
    }

    public static int maxPathSumBtwLeaves(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int lr = maxPathSumBtwLeaves(node.left);
        int rr = maxPathSumBtwLeaves(node.right);

        int max = Math.max(lr, rr) + node.data;
        res = Math.max(max, Math.max(res, lr + rr + node.data));
        return max;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();

        System.out.println(findmaxPathSum(tree.root));
    }

}
