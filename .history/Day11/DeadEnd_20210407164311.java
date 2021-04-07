public class DeadEnd {

    public static BinarySearchTree.Node deadNode = null;

    public static boolean checkDeadEnd(BinarySearchTree.Node node) {
        return check(node, 0, Integer.MAX_VALUE);
    }

    public static boolean check(BinarySearchTree.Node node, int lb, int ub) {
        if (ub - lb == 1 || ub - lb == 0) {
            if (deadNode != null)
                deadNode = node;
            return true;
        }
        if (node == null)
            return false;
        return check(node.left, lb, node.data) || check(node.right, node.data, ub);
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 8, 7, 2, 10, 9, 13 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        System.out.println(checkDeadEnd(tree.root));
        System.out.println(deadNode);
    }

}
