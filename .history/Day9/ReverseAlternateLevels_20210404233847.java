import java.util.ArrayList;

public class ReverseAlternateLevels {

    public static ArrayList<Integer> in = new ArrayList<>();

    public static void reverseAltLevels(BinaryTree.Node node) {
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

}
