import java.util.ArrayList;

public class LargestBSTinBinaryTree {

    public static int largestBST(BinaryTree.Node node) {
        res.clear();
        inOrder(node);
        int ans = 0;
        int count = 0;
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) < res.get(i + 1)) {

            } else {

            }
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
