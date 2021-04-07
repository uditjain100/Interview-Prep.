public class DeadEnd {

    public static boolean checkDeadEnd(BinarySearchTree.Node node) {
        return check(node, 0, Integer.MAX_VALUE);
    }

    public static boolean check(BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return false;
        if (ub - lb == 1)
            return true;
        return check(node.left, lb, node.data) || check(node.right, node.data, ub);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 8, 5, 2, 1, 7, 9 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(checkDeadEnd(tree.root));
    }

}
