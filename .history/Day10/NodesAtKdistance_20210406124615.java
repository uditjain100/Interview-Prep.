import java.util.ArrayList;

public class NodesAtKdistance {

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void nodesAtKdownDis(BinaryTree.Node node, BinaryTree.Node blockNode, int k) {
        if (node = null || node == blockNode)
            return;

        if (k == 0) {
            res.add(node.data);
            return;
        }

        nodesAtKdownDis(node.left, blockNode, k - 1);
        nodesAtKdownDis(node.right, blockNode, k - 1);
    }

    public static ArrayList<Integer> nodesAtKdis(BinaryTree.Node root, BinaryTree.Node node) {

        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<BinaryTree.Node> path = LCA.roottoNodePath2(root, node.data);

        for (int i = 0; i < path.size(); i++)
            nodesAtKdownDis(path.get(i), blockNode, k - i);
    }

}
