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

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();

        ArrayList<Integer> path = new ArrayList<>();
        roottoNodePath(tree.root, 12, path);
        System.out.println(path);
    }

}
