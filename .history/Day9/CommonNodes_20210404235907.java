import java.util.ArrayList;

public class CommonNodes {

    public static BinaryTree.Node LCA = null;

    public static ArrayList<Integer> res = new ArrayList<>();

    public static boolean printCommonNodes(BinaryTree.Node node, int p, int q) {
        if (node == null)
            return false;

        boolean selfDone = false;
        if (node.data == p || node.data == q)
            selfDone = true;

        boolean leftDone = printCommonNodes(node.left, p, q);
        if (LCA != null) {
            res.add(node.data);
            return true;
        }
        boolean rightDone = printCommonNodes(node.right, p, q);
        if (LCA != null) {
            res.add(node.data);
            return true;
        }

        if ((leftDone && rightDone) || (leftDone && selfDone) || (selfDone && rightDone)) {
            res.add(node.data);
            LCA = node;
        }
        return selfDone || leftDone || rightDone;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        printCommonNodes(tree.root, 10, 11);
        System.out.println(res);

    }

}
