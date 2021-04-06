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

    public static BinaryTree.Node lowestCommonAncestor1(BinaryTree.Node root, int target1, int target2) {
        ArrayList<BinaryTree.Node> p1 = roottoNodePath2(root, target1);
        ArrayList<BinaryTree.Node> p2 = roottoNodePath2(root, target2);

        int i = p1.size() - 1;
        int j = p2.size() - 1;
        while (i >= 0 && j >= 0 && p1.get(i) == p2.get(j)) {
            i--;
            j--;
        }
        return p1.get(i + 1);
    }

    public static BinaryTree.Node LCA = null;

    public static boolean lowestCommonAncestor2(BinaryTree.Node node, int p, int q) {
        if (node == null)
            return false;

        boolean selfDone = false;
        if (node.data == p || node.data == q)
            selfDone = true;

        boolean leftDone = lowestCommonAncestor2(node.left, p, q);
        if (LCA != null)
            return true;
        boolean rightDone = lowestCommonAncestor2(node.right, p, q);
        if (LCA != null)
            return true;

        if ((leftDone && rightDone) || (leftDone && selfDone) || (selfDone && rightDone))
            LCA = node;
        return selfDone || leftDone || rightDone;
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

        System.out.println();
        System.out.println(lowestCommonAncestor1(tree.root, 10, 11).data);
        lowestCommonAncestor2(tree.root, 10, 11);
        System.out.println(LCA.data);
    }

}
