public class InRange {

    public static void getInRange(BinarySearchTree.Node node, int lb, int ub) {

        if (node.data > lb && node.data > ub)
            getInRange(node.left, lb, ub);
        else if (node.data < lb && node.data < ub)
            getInRange(node.right, lb, ub);
        else {

        }

    }

}
