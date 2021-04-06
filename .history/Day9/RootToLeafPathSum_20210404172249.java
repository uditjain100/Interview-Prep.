public class RootToLeafPathSum {

    public static boolean checkpathsum(BinaryTree.Node root, int target) {

    }

    public static boolean check(BinaryTree.Node node, int target, int sum) {
        if (node == null)
            return false;

        boolean lr = checkpathsum(root.left, target, sum + node.data);
        boolean rr = checkpathsum(root.right, target, sum + node.data);

        if (node.left == null && node.right == null)
            return true;

        return lr || rr;
    }

}
