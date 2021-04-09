import java.util.ArrayList;

public class InRange {

    public static ArrayList<Intreger> res = new ArrayList<>();

    public static void getInRange(BinarySearchTree.Node node, int lb, int ub) {

        if (node.data > lb && node.data > ub)
            getInRange(node.left, lb, ub);
        else if (node.data < lb && node.data < ub)
            getInRange(node.right, lb, ub);
        else {
            res.add(node.data);
            getInRange(node.left, lb, ub);
            getInRange(node.left, lb, ub);

        }

    }

}
