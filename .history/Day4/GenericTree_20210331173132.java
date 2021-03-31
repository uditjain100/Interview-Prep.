import java.util.ArrayList;

public class GenericTree {

    public static class Node {
        int val;
        ArrayList<Node> childs;

        public Node(int val) {
            this.val = val;
            this.childs = new ArrayList()<>();
        }
    }

    private static Node root;

    public static Node root() {
        return root;
    }

    public GenericTree(int[] preOrder, int k) {
        int n = preOrder.length;
        int h = (int) Math.ceil(Math.log((double) n * (k - 1) + 1) / Math.log((double) k));
        this.root = construct(preOrder, k, h);
    }

    public static int index = 0;

    public static Node construct(int[] preOrder, int k, int h) {
        if (h == 0 || index == preOrder.length)
            return null;

        Node node = new Node(preOrder[index++]);
        for (int i = 0; i < k; i++)
            node.childs.add(construct(preOrder, k, h - 1));
        return node;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;
        String str = node.val + " => ";
        for (Node child : node.childs)
            if (child != null)
                str += child.val + ", ";

        System.out.println(str);
        for (Node child : node.childs)
            display(child);
    }
}
