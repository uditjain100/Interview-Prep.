public class RootToLeafPathSum {

    public static boolean checkpathsum(BinaryTree.Node root, int target) {

    }

    public static boolean check(BinaryTree.Node node, int target, int sum) {
        if (node == null)
            return false;

        if (node.left == null && node.right == null && sum + node.data == target)
            return true;

        boolean lr = checkpathsum(root.left, target, sum + node.data);
        boolean rr = checkpathsum(root.right, target, sum + node.data);

        return lr || rr;
    }

}
