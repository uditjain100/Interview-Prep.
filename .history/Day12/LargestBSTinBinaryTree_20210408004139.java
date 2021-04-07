import java.util.ArrayList;

public class LargestBSTinBinaryTree {

    public static int largestBST2(BinaryTree.Node node) {
        if (node == null)
            return 0;

        int lr = largestBST(node.left);
        int rr = largestBST(node.right);

        if (node.left == null && node.right == null) {
            return 1;
        } else if (node.left == null && node.right != null) {
            if (node.data < node.right.data)
                return rr + 1;
        } else if (node.left != null && node.right == null) {
            if (node.data > node.left.data)
                return lr + 1;
        } else {
            int res = 1;
            if (node.data > node.left.data)
                res += lr;
            if (node.data < node.right.data)
                res += rr;

        }

    }

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
        ans = Math.max(ans, count);
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
        int[] preOrder = { 50, 30, 5, -1, -1, 20, -1, -1, 60, 45, -1, -1, 70, 65, -1, -1, 80, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        System.out.println(largestBST(tree.root));
    }

}
