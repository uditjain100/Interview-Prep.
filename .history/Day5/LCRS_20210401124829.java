public class LCRS {

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

    public static display() {
        display(newroot);
    }

    private static void display(TreeNode node) {
        if (node == null)
            return;
        String str = node.val + " => ";
        TreeNode n = node;
        while (n.next != null) {
            str += n.next.val + ", ";
            n = n.next;
        }
        System.out.println(str);
        display(node.child);
    }

    public static void main(String[] args) {
        int[] preOrder = { 0, 1, 2, 9, -1, 4, 5, -1, -1, 3, -1, -1, 6, 7, -1, 8, -1, -1, -1, -1 };
        GTree tree = new GTree(preOrder);
        tree.display();
    }

}
