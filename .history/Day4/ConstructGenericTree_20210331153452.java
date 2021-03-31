public class ConstructGenericTree {

    public static class Node {
        int val;
        ArrayList<Node> childs;

        public Node(int val) {
            this.val = val;
            this.childs = new ArrayList<>();
        }
    }

    private Node root;

    public ConstructGenericTree(int[] preOrder, int k) {
        int height = (int) Math.ceil(Math.log((double) n * (k - 1) + 1) / Math.log((double) k));
        this.root = construct(preOrder, 0, k, h);
    }

    public static Node construct(int[] preOrder, int i, int k, int h) {
        if (h == 0 || i == preOrder.length)
            return null;

        Node node = new Node(preOrder[i]);
        for (int i = 0; i < k; i++)
            node.childs.add(construct(preOrder, i + 1, k, h - 1));
        return node;
    }

    public static void display() {
        String str = this.root.val + " => ";
        for (Node child : this.root.childs)
            if (child != null)
                str += child.val + ", ";

        System.out.println(str);
        for (Node child : this.root.childs)
            if (child != null)
                display(child);
    }

}
