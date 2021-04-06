import java.util.ArrayList;

public class LCA {

    public static boolean roottoNodePath1(BinaryTree.Node node, int target, ArrayList<Integer> path) {
        if (node == null)
            return false;
        if (node.data == target) {
            path.add(node.data);
            return true;
        }

        boolean ls = roottoNodePath1(node.left, target, path);
        boolean rs = roottoNodePath1(node.right, target, path);

        if (ls || rs)
            path.add(node.data);

        return ls || rs;
    }

    public static ArrayList<Integer> roottoNodePath2(BinaryTree.Node node, int target) {

        ArrayList<Integer> res = new ArrayList<>();

        if (node == null)
            return res;
        if (node.data == target) {
            res.add(node.data);
            return res;
        }

        res = roottoNodePath2(node.left, target);
        if (res.size() != 0) {
            res.add(node.data);
            return res;
        }

        res = roottoNodePath2(node.right, target);
        if (res.size() != 0)
            res.add(node.data);
        return res;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();

        ArrayList<Integer> path = new ArrayList<>();
        roottoNodePath1(tree.root, 12, path);
        System.out.println(path);

        System.out.println(roottoNodePath2(tree.root, 12));
    }

}
