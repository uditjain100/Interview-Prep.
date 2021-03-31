import java.util.*;

public class ConstructingGenericTree {

    public static class Node {
        int val;
        ArrayList<Node> childs;

        public Node(int val) {
            this.val = val;
            this.childs = new ArrayList<>();
        }
    }

    public static Node root;

    public ConstructingGenericTree(int[] preOrder, int k) {
        int n = preOrder.length;
        int height = (int) Math.ceil(Math.log((double) n * (k - 1) + 1) / Math.log((double) k));
        this.root = construct(preOrder, 0, k, h);
    }

    public static Node construct(int[] preOrder, int i, int k, int h) {
        if (h == 0 || i == preOrder.length)
            return null;

        Node node = new Node(preOrder[i]);
        for (int j = 0; j < k; j++)
            node.childs.add(construct(preOrder, i + 1, k, h - 1));
        return node;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        String str = root.val + " => ";
        for (Node child : root.childs)
            if (child != null)
                str += child.val + ", ";

        System.out.println(str);
        for (Node child : root.childs)
            if (child != null)
                display(child);
    }

    public static void main(String[] args) {
        int preOrder[] = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4 };
        ConstructingGenericTree tree = new ConstructingGenericTree(preOrder, 3);
    }

}
