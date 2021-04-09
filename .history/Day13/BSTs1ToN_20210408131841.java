import java.util.ArrayList;

public class BSTs1ToN {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static Node root = null;

    public static void constructBSTs(int n) {
    }

    public static ArrayList<Node> constructor(int s, int e) {

        ArrayList<Node> res = new ArrayList<>();

        if (s > e) {
            res.add(null);
            resturn res;
        }

        for (int i = s; i <= e; i++) {

            ArrayList<Node> leftSubTrees = constructor(s, i - 1);
            ArrayList<Node> rightSubTrees = constructor(i + 1, e);

            for (int j = 0; i < leftSubTrees.size(); j++) {
                Node left = leftSubTrees.get(j);
                for (int k = 0; k < rightSubTrees.size(); k++) {
                    Node right = rightSubTrees.get(k);
                    Node nn = new Node(i);
                    nn.left = left;
                    nn.right = right;
                    res.add(nn);
                }
            }
        }
        return res;
    }

    private static void display(Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += "[" + node.left.data + ",L], ";
        if (node.right != null)
            str += "[" + node.right.data + ",R]";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

}
