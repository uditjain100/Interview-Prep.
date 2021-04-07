public class DeadEnd {

    public static boolean checkDeadEnd(BinarySearchTree.Node node) {
        return check(node, 0, Integer.MAX_VALUE);
    }

    public static boolean check(BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return false;
        if (ub - lb)
            return true;
        return check(node.left, lb, node.data) || check(node.right, node.data, ub);
    }

}
