import java.util.ArrayList;

public class InRange {

    public static ArrayList<Intreger> res = new ArrayList<>();

    public static void getInRange(BinarySearchTree.Node node, int lb, int ub) {
        if (node == null)
            return;
        if (node.data > lb && node.data > ub)
            getInRange(node.left, lb, ub);
        else if (node.data < lb && node.data < ub)
            getInRange(node.right, lb, ub);
        else {
            res.add(node.data);
            getInRange(node.left, lb, ub);
            getInRange(node.right, lb, ub);
        }
    }

    public static void main(String[] args) {
        int[] pre = new int[] { 10, 5, 1, 7, 40, 30, 50 };
        BinarySearchTree tree = new BinarySearchTree(pre);
        tree.display();
        getInRange(tree.root, 8, 55);
        System.out.println(res);
    }

}
