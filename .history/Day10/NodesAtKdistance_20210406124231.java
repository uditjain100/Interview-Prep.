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

    public static ArrayList<Integer> nodesAtKdis(BinaryTree.Node node) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; i++) {

        }
    }

}
