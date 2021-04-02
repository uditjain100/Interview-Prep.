public class BinaryTreeClone {

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode random;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.random = null;
        }

    }

    public static BinaryTree.Node root;

    public BinaryTreeClone(BinaryTree.Node node) {
        root = constructor(node);
    }

    public static BinaryTree.Node constructor(BinaryTree.Node node) {
        if (node == null)
            return null;

        BinaryTree.Node nn = new BinaryTree.Node(node.data);
        nn.left = constructor(node.left);
        nn.right = constructor(node.right);
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(BinaryTree.Node node) {
        if (node == null)
            return;

        String str = node.data + " => ";

        if (node.left != null)
            str += node.left.data + ", ";
        if (node.right != null)
            str += node.right.data + ", ";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

        int[] preOrder = { 10, 20, 40, -1, -1, 50, 80, -1, -1, 90, -1, -1, 30, 60, 100, -1, -1, -1, 70, 110, -1, -1,
                120, -1, -1 };
        BinaryTree tree = new BinaryTree(preOrder);
        // tree.display();
        // System.out.println("**********************");
        BinaryTreeClone treeClone = new BinaryTreeClone(tree.root);
        // treeClone.display();
        System.out.println(tree.root == treeClone.root);
    }
}
