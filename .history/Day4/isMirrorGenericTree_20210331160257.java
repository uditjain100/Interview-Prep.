import java.util.ArrayList;

public class isMirrorGenericTree extends ConstructingGenericTree {

    public static class Node {
        int val;
        ArrayList<Node> childs;

        public Node(int val) {
            this.val = val;
            this.childs = new ArrayList<>();
        }
    }

    private Node root;

    public static void main(String[] args) {
        int preOrder[] = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4 };
        ConstructingGenericTree tree = new ConstructingGenericTree(preOrder, 3);
        tree.display();
    }

    public static boolean fun(Node root1, Node root2) {
        if (root1 == null && root2 == null)
            return true;
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null) || (root1.val != root2.val)
                || (root1.childs.size() != root2.childs.size()))
            return false;

        boolean res = false;
        for (int i = 0; i < root1.childs.size(); i++)
            res = res && fun(root1.childs.get(i), root2.childs.get(root1.childs.size() - 1 - i));
        return res;
    }

}
