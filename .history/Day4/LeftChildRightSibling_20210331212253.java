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

        TreeNode nn = new TreeNode(root.val);
        Node lastNode = node.childs(node.childs.size() - 1);
        for (int i = node.childs.size() - 2; i >= 0; i--) {

        }

    }

    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
    }

}
