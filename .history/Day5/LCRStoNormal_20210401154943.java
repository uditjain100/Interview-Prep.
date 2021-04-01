import LCRS.TreeNode;
import jdk.internal.org.jline.utils.Display;

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

    public static GTree.Node decode(TreeNode node) {

        GTree.Node nn = new GTree.Node(node.data);

        TreeNode temp = node.child;
        while (temp != null && temp.next != null) {
            if (temp.data == -1)
                continue;
            Gtree.Node cn = new GTree.Node(temp.data);
            nn.childs.add(cn);
            decode(temp);
        }
        return nn;
    }

}
