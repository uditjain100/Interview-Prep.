import java.util.ArrayList;

public class LargestBSTinBinaryTree {

    public static int largestBST(BinaryTree.Node node) {
        res.clear();
        inOrder(node);
        int ans = 1;
        int count = 1;
        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i) < res.get(i + 1))
                count++;
            else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        return ans;
    }

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void inOrder(BinaryTree.Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        res.add(node.data);
        inOrder(node.right);
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();

    }

}
