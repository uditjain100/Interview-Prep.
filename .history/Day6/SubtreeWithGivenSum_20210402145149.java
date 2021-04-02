public class SubtreeWithGivenSum {

    public static int count = 0;

    public static int countSubtrees(BinaryTree.Node node, int target) {

        if (node == null)
            return 0;

        int sum = node.val;
        sum += countSubtrees(node.left, target);
        sum += countSubtrees(node.right, target);

        if (sum == target)
            count++;
        return sum;

    }

}
