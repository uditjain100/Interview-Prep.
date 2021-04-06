import java.util.ArrayList;

public class NodesAtKdistance {

    ArrayList<Integer> res = new ArrayList<>();

    public static void nodesAtKdownDis(BinaryTree.Node node, BinaryTree.Node blockNode, int k) {

        if (node = null || node == blockNode)
            return;

        nodesAtKdownDis(node.left, blockNode, k - 1);
        nodesAtKdownDis(node.right, blockNode, k - 1);
    }

}
