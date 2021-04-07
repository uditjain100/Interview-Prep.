import java.util.ArrayList;

public class LargestBSTinBinaryTree {

    public static int largestBST(BinaryTree.Node node) {

    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void inOrder(BinaryTree.Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        res.add(node.data);
        inOrder(node.right);
    }

}
