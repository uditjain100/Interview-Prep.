import java.util.ArrayList;

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

    public static BinaryTree.Node leafMax = null;
    public static int max = Integer.MIN_VALUE;

    public static ArrayList<BinaryTree.Node> rootToLeafMaxSum(BinaryTree.Node node) {
        rootToLeafMaxSum(node, 0);
        LCA lca = new LCA();
        return lca.roottoNodePath2(node, leafMax.data);
    }

    public static void rootToLeafMaxSum(BinaryTree.Node node, int sum) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            if (max < sum + node.data) {
                max = sum + node.data;
                leafMax = node;
            }
            return;
        }
        rootToLeafMaxSum(node.left, sum + node.data);
        rootToLeafMaxSum(node.right, sum + node.data);
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        System.out.println(checkpathsum(tree.root, 18));
            ArrayList<BinaryTree.Node> path =  rootToLeafMaxSum(tree.root));

    }

}
