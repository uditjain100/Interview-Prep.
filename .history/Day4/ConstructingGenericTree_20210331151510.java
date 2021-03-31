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

    public ConstructingGenericTree() {
        construct();
    }

    public static void main(String[] args) {

    }

    public static void construct() {

    }

}
