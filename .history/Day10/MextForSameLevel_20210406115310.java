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

    public static void display() {
        display(root);
    }

    private static void display(NodeNext node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";
        if (node.nextRight != null)
            str += node.nextRight.data + ", ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        int[] preorder = { 1, 2, 4, -1, -1, 5, 8, -1, -1, 9, -1, -1, 3, 6, 10, -1, -1, -1, 7, 11, -1, -1, 12, -1, -1 };
        BinaryTree tree = new BinaryTree(preorder);
        tree.display();
        MextForSameLevel nTree = new MextForSameLevel(tree.root);
        nTree.display();
    }

}
