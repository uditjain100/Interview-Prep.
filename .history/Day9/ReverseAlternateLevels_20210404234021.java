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

        if (level % 2 == 1)
            in.add(node.val);

        collectAltLevels(node.left, level + 1);
        collectAltLevels(node.right, level + 1);
    }

    public static int idx = 0;

    public static void reverseAltLevels(BinaryTree.Node node, int level) {
        if (node == null)
            return;

        if (level % 2 == 1)
            node.val = in.get(idx++);

        reverseAltLevels(node.left, level + 1);
        reverseAltLevels(node.right, level + 1);
    }

}
