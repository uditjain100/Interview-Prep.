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
        construct(preOrder, k);
    }

    public static void construct(int[] preOrder, int k) {

    }

    public static void main(String[] args) {

    }
}
