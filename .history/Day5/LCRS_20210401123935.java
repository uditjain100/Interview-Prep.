public class LCRS extends GTree {

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

    public LCRS(Node root) {
        newroot = construct(root);
    }

    public static TreeNode construct(Node node) {
        if (node.childs.size() == 0)
            return new TreeNode(node.val);

        TreeNode nn = new TreeNode(node.val);
        TreeNode dummy = new TreeNode(-1);
        for (int i = node.childs.size() - 1; i >= 0; i--) {
            TreeNode cn = construct(node.childs.get(i));
            cn.next = dummy;
            dummy = cn;
        }
        nn.child = dummy;
        return nn;
    }

}
