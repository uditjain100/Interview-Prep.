import java.util.ArrayList;

public class ReverseTreePath {

    public static void reverse(BinaryTree.Node node, int target) {
        ArrayList<BinaryTree.Node> path = reversePath(node, target);

    }

    public static ArrayList<BinaryTree.Node> reversePath(BinaryTree.Node node, int target) {
        ArrayList<BinaryTree.Node> res = new ArrayList<>();

        if (node == null)
            return res;
        if (node.data == target) {
            res.add(node);
            return res;
        }

        res = reversePath(node.left, target);
        if (res.size() != 0) {
            res.add(node);
            return res;
        }
        res = reversePath(node.right, target);
        if (res.size() != 0)
            res.add(node);
        return res;
    }

}
