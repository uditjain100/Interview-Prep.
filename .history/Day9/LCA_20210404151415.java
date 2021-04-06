import java.util.ArrayList;

public class LCA {

    public static boolean roottoNodePath(BinaryTree.Node node, int target, ArrayList<Integer> path) {

        if (node == null)
            return false;
        if (node.data == target) {
            path.add(node.data);
            return true;
        }

        boolean ls = roottoNodePath(node.left, target, path);
        boolean rs = roottoNodePath(node.right, target, path);

        if (ls || rs)
            path.add(node.data);

        return ls || rs;
    }

}
