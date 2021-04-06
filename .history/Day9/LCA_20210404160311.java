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

    public static ArrayList<BinaryTree.Node> roottoNodePath2(BinaryTree.Node node, int target) {
        ArrayList<BinaryTree.Node> res = new ArrayList<>();

        if (node == null)
            return res;
        if (node.data == target) {
            res.add(node);
            return res;
        }

        res = roottoNodePath2(node.left, target);
        if (res.size() != 0) {
            res.add(node);
            return res;
        }

        res = roottoNodePath2(node.right, target);
        if (res.size() != 0)
            res.add(node);
        return res;
    }

    public static BinaryTree.Node lowestCommonAncestor(BinaryTree.Node root, int target1, int target2) {

        ArrayList<BinaryTree.Node> p1 = roottoNodePath2(root, node1.data);
        ArrayList<BinaryTree.Node> p2 = roottoNodePath2(root, node2.data);

        int i = p1.size() - 1;
        int j = p2.size() - 1;
        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }
        return p1.get(i);
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();

        ArrayList<Integer> path = new ArrayList<>();
        roottoNodePath1(tree.root, 12, path);
        System.out.println(path);

        ArrayList<BinaryTree.Node> p = roottoNodePath2(tree.root, 12);
        System.out.println();
        for (BinaryTree.Node node : p)
            System.out.print(node.data + ", ");
    }

}
