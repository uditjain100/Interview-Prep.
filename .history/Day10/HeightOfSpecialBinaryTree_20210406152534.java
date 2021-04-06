public class HeightOfSpecialBinaryTree {

    public static BinaryTree.Node DLLhead = null;
    public static BinaryTree.Node DLLprev = null;

    public static void circularLeafDLL(BinaryTree.Node node) {
        DLLleaf(node);
        DLLprev.right = DLLhead;
        DLLhead.left = DLLprev;
    }

    public static void DLLleaf(BinaryTree.Node node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            if (DLLhead == null)
                DLLhead = node;
            else {
                DLLprev.right = node;
                node.left = DLLprev;
            }
            DLLprev = node;
            return;
        }

        DLLleaf(node.left);
        DLLleaf(node.right);
    }

    public static void display(BinaryTree.Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";
        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";

        System.out.println(str);

        if (node.right != null && node.right.left != null && node.right.left == node)
            return;

        display(node.left);
        display(node.right);
    }

    public static int height(BinaryTree.Node node) {
        if (node == null)
            return 0;
        if (node.right != null && node.right.left != null && node.right.left == node)
            return 0;

        int lr = height(node.left);
        int rr = height(node.right);
        return Math.max(lr, rr) + 1;
    }

    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        tree.display();
        DLLleaf(tree.root);
        display(tree.root);
        System.out.println(height(tree.root));
    }

}
