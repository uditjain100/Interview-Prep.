public class DistanceBTWnodes {

    public static int finddistance(BinaryTree.Node root, int p, int q) {

        LCA lca = new LCA();
        lca.lowestCommonAncestor2(root, p, q);
        BinaryTree.Node lcaNode = lca.LCA;

    }

    public static void dis(BinaryTree.Node node, int target) {
        if (node == null)
            return 0;

    }

}
