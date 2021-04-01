public class LCRStoNormal {
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

    public static GTree.Node decode(LCRS.TreeNode node) {
        GTree.Node nn = new GTree.Node(node.data);

        LCRS.TreeNode temp = node.child;
        while (temp != null && temp.next != null) {
            if (temp.data == -1)
                break;
            GTree.Node cn = new GTree.Node(temp.data);
            nn.childs.add(cn);
            decode(temp);
            temp = temp.next;
        }
        return nn;
    }

    public static void display() {
        display(root);
    }

    private static void display(Node node) {
        if (node == null)
            return;
        String str = node.data + " => ";
        for (Node child : node.childs)
            if (child != null)
                str += child.data + ", ";

        System.out.println(str);
        for (Node child : node.childs)
            display(child);
    }

}
