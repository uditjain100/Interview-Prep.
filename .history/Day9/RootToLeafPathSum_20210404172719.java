public class RootToLeafPathSum {

    public static boolean checkpathsum(BinaryTree.Node root, int target) {
        return check(root, target, 0);
    }

    public static boolean check(BinaryTree.Node node, int target, int sum) {
        if (node == null)
            return false;

        if (node.left == null && node.right == null && sum + node.data == target)
            return true;

        boolean lr = check(node.left, target, sum + node.data);
        boolean rr = check(node.right, target, sum + node.data);

        return lr || rr;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        System.out.println(checkpathsum(tree.root, 17));

    }

}
