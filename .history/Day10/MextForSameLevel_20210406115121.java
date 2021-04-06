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
        root = constructor(node);
        nextPointerWork(root);
    }

    public static NodeNext constructor(BinaryTree.Node node) {
        if (node == null)
            return null;

        NodeNext nn = new NodeNext(node.data);

        nn.left = constructor(node.left);
        nn.right = constructor(node.right);

        return nn;
    }

    public static void nextPointerWork(NodeNext node) {
        if (node == null)
            return;
        if (node.left != null) {
            if (node.right != null)
                node.left.nextRight = node.right;
            else
                node.left.nextRight = getNextRight(node);
        }
        if (node.right != null)
            node.right.nextRight = getNextRight(node);
        nextPointerWork(node.left);
        nextPointerWork(node.right);
    }

    public static NodeNext getNextRight(NodeNext node) {
        node = node.nextRight;
        while (node != null) {
            if (node.left != null)
                return node.left;
            if (node.right != null)
                return node.right;
            node = node.nextRight;
        }
        return null;
    }

}
