import java.util.ArrayList;

public class LargestBSTinBinaryTree {

    public static class Pair {
        int size;
        boolean isBST;

        public Pair(int size, boolean isBST) {
            this.size = size;
            this.isBST = isBST;
        }
    }

    public static int getLargestBST(BinaryTree.Node node) {
        return largestBST2(node).size;
    }

    public static Pair largestBST2(BinaryTree.Node node) {
        if (node == null)
            return new Pair(0, true);

        Pair lr = largestBST2(node.left);
        Pair rr = largestBST2(node.right);

        if (node.left == null && node.right == null)
            return new Pair(1, true);
        else if (node.left == null && node.right != null && node.data < node.right.data && rr.isBST)
            return new Pair(rr.size + 1, true);
        else if (node.left != null && node.right == null && node.data > node.left.data && lr.isBST)
            return new Pair(lr.size + 1, true);
        else if (node.left != null && node.right != null && node.data > node.left.data && node.data < node.right.data
                && lr.isBST && rr.isBST)
            return new Pair(lr.size + rr.size + 1, true);
        return new Pair(Math.max(lr.size, rr.size), false);
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
        System.out.println(getLargestBST(tree.root));
    }

}
