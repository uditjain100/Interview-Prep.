public class MextForSameLevel {

    public static class NodeNext {
        int data;
        NodeNext left;
        NodeNext right;
        NodeNext nextRight;

        public NodeNext(int data) {
            this.data = data;
            this.left = this.right = this.nextRight = null;
        }
    }

    public static NodeNext root;

    public MextForSameLevel(BinaryTree.Node node) {

    }

}
