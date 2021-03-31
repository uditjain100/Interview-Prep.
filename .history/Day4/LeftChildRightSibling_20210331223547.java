public class LeftChildRightSibling extends GenericTree {

    public static class TreeNode {
        int val;
        TreeNode next;
        TreeNode child;

        public TreeNode(int data) {
            val = data;
            next = null;
            child = null;
        }
    }

    public static TreeNode root;

    public LeftChildRightSibling(Node root) {
        root = construct(root);
    }

    public static TreeNode construct(Node node) {

        if (node.childs.size() == 0)
            return null;

        TreeNode nn = new TreeNode(root.val);

        for (int i = node.childs.size() - 1; i >= 0; i--) {
            TreeNode cn = construct(node.childs.get(i));

        }

    }

    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
    }

}
