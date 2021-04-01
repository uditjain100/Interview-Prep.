public class LCRS {

    public static class TreeNode {
        int data;
        TreeNode next;
        TreeNode child;

        public TreeNode(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    public static TreeNode newroot;

    public LCRS(GTree.Node root) {
        newroot = construct(root);
    }

    public static TreeNode construct(GTree.Node node) {
        if (node.childs.size() == 0)
            return new TreeNode(node.data);

        TreeNode nn = new TreeNode(node.data);
        TreeNode dummy = new TreeNode(-1);
        for (int i = node.childs.size() - 1; i >= 0; i--) {
            TreeNode cn = construct(node.childs.get(i));
            cn.next = dummy;
            dummy = cn;
        }
        nn.child = dummy;
        return nn;
    }

    public static void displayLCRS() {
        display(newroot);
    }

    private static void display(TreeNode node) {
        if (node == null)
            return;
        String str = node.data + " => ";
        TreeNode n = node;
        while (n.next != null) {
            str += n.next.data + ", ";
            n = n.next;
        }
        System.out.println(str);
        display(node.child);
    }

    public static void main(String[] args) {
        int[] preOrder = { 10, 20, 30, -1, 40, -1, 50, -1, -1, 60, 70, -1, 80, 90, -1, 100, -1, -1, 110, -1, -1, 120,
                130, -1, -1, -1 };
        GTree tree = new GTree(preOrder);
        tree.display();
        System.out.println("********************");
        LCRS newTree = new LCRS(tree.root());
        newTree.displayLCRS();
        System.out.println("********************");
    }

}
