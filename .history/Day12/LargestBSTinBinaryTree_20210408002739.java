import java.util.ArrayList;

public class LargestBSTinBinaryTree {

    public static int largestBST(BinaryTree.Node node) {
        res.clear();
        inOrder(node);
        for (int i = 0; i < res.size(); i++) {

        }
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
