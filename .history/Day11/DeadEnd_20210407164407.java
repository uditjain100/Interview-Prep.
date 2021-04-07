public class DeadEnd {

    public static boolean checkDeadEnd(BinarySearchTree.Node node) {
        return check(node, 0, Integer.MAX_VALUE);
    }

    public static boolean check(BinarySearchTree.Node node, int lb, int ub) {
        if (ub - lb == 1 || ub - lb == 0)
            return true;
        if (node == null)
            return false;
        return check(node.left, lb, node.data) || check(node.right, node.data, ub);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(checkDeadEnd(tree.root));
    }

}
