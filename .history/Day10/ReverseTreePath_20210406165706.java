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
            res.add(node.data);
            return res;
        }

        ArrayList<BinaryTree.Node> lr = reversePath(node.left, target);
        ArrayList<BinaryTree.Node> rr = reversePath(node.right, target);

    }

}
