import java.util.ArrayList;

public class NodesAtKdistance {

    public static ArrayList<Integer> res = new ArrayList<>();

    public static void nodesAtKdownDis(BinaryTree.Node node, BinaryTree.Node blockNode, int k) {
        if (node == null || node == blockNode)
            return;

        if (k == 0) {
            res.add(node.data);
            return;
        }

        nodesAtKdownDis(node.left, blockNode, k - 1);
        nodesAtKdownDis(node.right, blockNode, k - 1);
    }

    public static ArrayList<Integer> nodesAtKdis(BinaryTree.Node root, int nodeData, int k) {
        ArrayList<BinaryTree.Node> path = LCA.roottoNodePath2(root, nodeData);
        path.add(0, null);

        for (int i = 1; i < path.size(); i++)
            nodesAtKdownDis(path.get(i), path.get(i - 1), k - i + 1);
        return res;
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        System.out.println(nodesAtKdis(tree.root, 6, 3));
    }

}
