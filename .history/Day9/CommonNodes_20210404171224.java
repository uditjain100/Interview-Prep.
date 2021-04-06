public class CommonNodes {

    public static boolean lowestCommonAncestor2(BinaryTree.Node node, int p, int q) {
        if (node == null)
            return false;

        boolean selfDone = false;
        if (node.data == p || node.data == q)
            selfDone = true;

        boolean leftDone = lowestCommonAncestor2(node.left, p, q);
        if (LCA != null) {
            System.out.print(node.data + ", ");
            return true;
        }
        boolean rightDone = lowestCommonAncestor2(node.right, p, q);
        if (LCA != null) {
            System.out.print(node.data + ", ");
            return true;
        }

        if ((leftDone && rightDone) || (leftDone && selfDone) || (selfDone && rightDone)) {
            System.out.print(node.data + ", ");
            LCA = node;
        }
        return selfDone || leftDone || rightDone;
    }

}
