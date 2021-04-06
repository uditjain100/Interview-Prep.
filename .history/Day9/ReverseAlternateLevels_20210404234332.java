import java.util.ArrayList;
import java.util.Collections;

public class ReverseAlternateLevels {

    public static ArrayList<Integer> in = new ArrayList<>();

    public static void reverseAltLevels(BinaryTree.Node node) {
        collectAltLevels(node, 0);
        Collections.reverse(in);
        reverseAltLevels(node, 0);
    }

    public static void collectAltLevels(BinaryTree.Node node, int level) {
        if (node == null)
            return;

        collectAltLevels(node.right, level + 1);
        collectAltLevels(node.left, level + 1);

        if (level % 2 == 1)
            in.add(node.data);
    }

    public static int idx = 0;

    public static void reverseAltLevels(BinaryTree.Node node, int level) {
        if (node == null)
            return;

        if (level % 2 == 1)
            node.data = in.get(idx++);

        reverseAltLevels(node.left, level + 1);
        reverseAltLevels(node.right, level + 1);
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        reverseAltLevels(tree.root);
        tree.display();
    }

}
