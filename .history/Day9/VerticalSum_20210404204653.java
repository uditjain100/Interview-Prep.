import java.util.ArrayList;

public class VerticalSum {
    public static int leftEnd = Integer.MAX_VALUE;
    public static int rightEnd = Integer.MIN_VALUE;

    public static int getWidth(BinaryTree.Node node) {
        width(node, 0);
        return rightEnd - leftEnd + 1;
    }

    private static void width(BinaryTree.Node node, int level) {
        if (node == null)
            return;

        leftEnd = Math.min(leftEnd, level);
        rightEnd = Math.max(rightEnd, level);

        width(node.left, level - 1);
        width(node.right, level + 1);
    }

    public static ArrayList<Integer> res;

    public static ArrayList<Integer> verticalSum(BinaryTree.Node node) {
        verticalSum(node, -leftEnd);
    }

    public static void verticalSum(BinaryTree.Node node, int level) {
        if (node == null)
            return;

        res.set(level, res.get(level) + node.data);

        verticalSum(node.left, level - 1);
        verticalSum(node.right, level + 1);

    }

}
