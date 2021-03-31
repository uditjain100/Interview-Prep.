public class LeftChildRightSibling {

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

    public static TreeNode newroot;

    public LeftChildRightSibling(Node root) {
        newroot = construct(root);
    }

    public static TreeNode construct(Node node) {

        if (node.childs.size() == 0)
            return new TreeNode(-1);

        TreeNode nn = new TreeNode(root.val);
        TreeNode n = new TreeNode(-1);
        for (int i = node.childs.size() - 1; i >= 0; i--) {
            TreeNode cn = construct(node.childs.get(i));
            cn.next = n;
            n = cn;
        }

    }

    public static void main(String[] args) {
        int[] preOrder = { 1, 2, 5, 6, 7, 3, 8, 9, 10, 4, 11, 12, 13 };
        GenericTree tree = new GenericTree(preOrder, 3);
        tree.display();
    }

}
