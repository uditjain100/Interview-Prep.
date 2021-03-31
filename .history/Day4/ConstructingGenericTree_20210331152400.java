public class ConstructingGenericTree {

    public static class Node {
        int val;
        ArrayList<Node> childs;

        public Node(int val) {
            this.val = val;
            this.childs = new ArrayList<>();
        }
    }

    private Node root;

    public ConstructingGenericTree(int[] preOrder, int k) {
        int height = (int) Math.ceil(Math.log((double) n * (k - 1) + 1) / Math.log((double) k));
        this.root = construct(preOrder, 0, k, h);
    }

    public static Node construct(int[] preOrder, int i, int k, int h) {

        Node node = new Node(preOrder[i]);
        for (int i = 0; i < k; i++) {

        }

    }

    public static void main(String[] args) {

    }
}
